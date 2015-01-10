/*************************************************************************
 *  Compilation:  javac RSA.java
 *  Execution:    java RSA N
 *  
 *  Generate an N-bit public and private RSA key and use to encrypt
 *  and decrypt a random message.
 * 
 *  % java RSA 50
 *  public  = 65537
 *  private = 553699199426609
 *  modulus = 825641896390631
 *  message   = 48194775244950
 *  encrpyted = 321340212160104
 *  decrypted = 48194775244950
 *
 *  Known bugs (not addressed for simplicity)
 *  -----------------------------------------
 *  - It could be the case that the message >= modulus. To avoid, use
 *    a do-while loop to generate key until modulus happen to be exactly N bits.
 *
 *  - It's possible that gcd(phi, publicKey) != 1 in which case
 *    the key generation fails. This will only happen if phi is a
 *    multiple of 65537. To avoid, use a do-while loop to generate
 *    keys until the gcd is 1.
 *
 *************************************************************************/

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.BitSet;
import java.util.Random;


public class RSA {
	private final static BigInteger one      = new BigInteger("1");
	private final static SecureRandom random = new SecureRandom();

	private BigInteger privateKey;
	private BigInteger publicKey;
	private BigInteger modulus;

	// generate an N-bit (roughly) public and private key
	RSA(int N) {

		BigInteger p = BigInteger.ZERO;
		BigInteger q = BigInteger.ZERO;

		while(p.compareTo(q) == 0){
			p = BigInteger.probablePrime(N/2, random);
			q = BigInteger.probablePrime(N/2, random);
		}

		modulus = p.multiply(q);
		crear_clave(p, q);
	}

	public BigInteger[] crear_clave(BigInteger p, BigInteger q) {
		BigInteger[] result = new BigInteger[2];

		BigInteger phi = (p.subtract(one)).multiply(q.subtract(one));
		Random rd = new Random();

		do {
			publicKey = new BigInteger(p.bitLength(), rd);
			publicKey = publicKey.mod(phi);
		} while (!publicKey.gcd(phi).equals(one));

		privateKey = publicKey.modInverse(phi);

		result[0] = publicKey;
		result[1] = privateKey;

		return result;
	}


	BigInteger cifrar(BigInteger mensaje, BigInteger clave_publica, BigInteger mod) {
		return mensaje.modPow(clave_publica, mod);
	}

	BigInteger descifrar(BigInteger mensaje, BigInteger clave_privada, BigInteger mod) {
		return mensaje.modPow(clave_privada, mod);
	}

	public String toString() {
		String s = "";
		s += "La clave publica es  = " + publicKey  + "\n";
		s += "La clave privada es = " + privateKey + "\n";
		s += "El modulo es = " + modulus;
		return s;
	}

	public static void main(String[] args) {
		
		int N = Integer.parseInt(args[0]);
		RSA key = new RSA(N);

		System.out.println(key);

		// create random message, encrypt and decrypt
		BigInteger message = new BigInteger(N-1, random);

		/// create message by converting string to integer
		/*String s = "test";
		byte[] bytes = s.getBytes();
		BigInteger message = new BigInteger(bytes);*/

		BigInteger encrypt = key.cifrar(message, key.publicKey, key.modulus);
		BigInteger decrypt = key.descifrar(encrypt, key.privateKey, key.modulus);
		System.out.println("Mensaje   = " + message);
		System.out.println("Encriptado = " + encrypt);
		System.out.println("Desencriptado = " + decrypt);
	}
	
	
}