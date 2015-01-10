package uma.seguridad;

public class ModoCTR {
	
	public static byte[] cifrar(byte[] clave, byte[] mensaje){
		byte[] contador = new byte[AES128.TAM_BLOQUE_BYTES];
		byte[] mensajeCifrado = new byte[mensaje.length];
		
		/* Ciframos bloque a bloque */
		for(int i = 0; i < mensaje.length; i+=AES128.TAM_BLOQUE_BYTES){
			if(i+AES128.TAM_BLOQUE_BYTES < mensaje.length){
				byte[] bloque = new byte[AES128.TAM_BLOQUE_BYTES];
				System.arraycopy(mensaje, i, bloque, 0, AES128.TAM_BLOQUE_BYTES);
				byte[] contador_cifrado = AES128.cifrarBloque(clave, contador);
				byte[] bloque_cifrado = Util.xor(bloque, contador_cifrado);
				System.arraycopy(bloque_cifrado, 0, mensajeCifrado, i, AES128.TAM_BLOQUE_BYTES);
				contador[contador.length-1]++;
			}else{
				int tam_bloque = mensaje.length-i;
				byte[] bloque = new byte[tam_bloque];
				System.arraycopy(mensaje, i, bloque, 0, tam_bloque);
				byte[] contador_cifrado = AES128.cifrarBloque(clave, contador);
				byte[] bloque_cifrado = Util.xor(bloque, contador_cifrado);
				System.arraycopy(bloque_cifrado, 0, mensajeCifrado, i, tam_bloque);
				contador[contador.length-1]++;
			}
		}
		return mensajeCifrado;
	}
	
    public static byte[] descifrar(byte[] key, byte[] mensajeCifrado){
        return cifrar(key,mensajeCifrado);
    }
	
	public static void main(String[] args){
		byte[] k = Util.hexStringToBytes("2b7e151628aed2a6abf7158809cf4f3c"); 
		byte[] m = Util.hexStringToBytes("6bc1bee22e409f96e93d7e117393172a"); 
		byte[] c = ModoCTR.cifrar(k, m); 
		System.out.println("c = " + Util.bytesToHexString(c));
	}

}
