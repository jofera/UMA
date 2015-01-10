package uma.seguridad;

/* Simula un canal con ruido que induce un error en el texto cifrado */
public class Ruido {
	
	public static void ruidoECB() {
		byte[] mensaje = Util.stringToBytes("Este es un texto de ejemplo largo que ocupa 48 B");
		byte[] clave = Util.hexStringToBytes("2b7e151628aed2a6abf7158809cf4f3c");
		byte[] mensaje_cifrado = ModoECB.cifrar(clave, mensaje);
		System.out.println("Mensaje cifrado: " + Util.bytesToHexString(mensaje_cifrado));
		byte[] mensaje_descifrado = ModoECB.descifrar(clave,mensaje_cifrado);
		System.out.println("Mensaje descifrado: " + Util.bytesToString(mensaje_descifrado));
		byte[] mensaje_cifrado_2 = mensaje_cifrado;
		mensaje_cifrado_2[21] = Util.cambiarBit(mensaje_cifrado_2[21], 6);
		System.out.println("Tras cambiar bit en mensaje cifrado");
		System.out.println("Mensaje cifrado: " + Util.bytesToHexString(mensaje_cifrado));
		byte[] mensaje_descifrado_2 = ModoECB.descifrar(clave,mensaje_cifrado_2);
		System.out.println("Mensaje descifrado: " + Util.bytesToString(mensaje_descifrado_2));
		int diferencias = 0;
		for(int i = 0; i<mensaje.length; i++){
			diferencias += Util.contarBitsDiferentes(mensaje[i], mensaje_descifrado_2[i]);
		}
		System.out.println("Han cambiado " + diferencias + " bits");
	}
	
	public static void ruidoCTR() {
		byte[] mensaje = Util.stringToBytes("Este es un texto de ejemplo largo que ocupa 48 B");
		byte[] clave = Util.hexStringToBytes("2b7e151628aed2a6abf7158809cf4f3c");
		byte[] mensaje_cifrado = ModoCTR.cifrar(clave, mensaje);
		System.out.println("Mensaje cifrado: " + Util.bytesToHexString(mensaje_cifrado));
		byte[] mensaje_descifrado = ModoCTR.descifrar(clave,mensaje_cifrado);
		System.out.println("Mensaje descifrado: " + Util.bytesToString(mensaje_descifrado));
		byte[] mensaje_cifrado_2 = mensaje_cifrado;
		mensaje_cifrado_2[21] = Util.cambiarBit(mensaje_cifrado_2[21], 6);
		System.out.println("Tras cambiar bit en mensaje cifrado");
		System.out.println("Mensaje cifrado: " + Util.bytesToHexString(mensaje_cifrado));
		byte[] mensaje_descifrado_2 = ModoCTR.descifrar(clave,mensaje_cifrado_2);
		System.out.println("Mensaje descifrado: " + Util.bytesToString(mensaje_descifrado_2));
		int diferencias = 0;
		for(int i = 0; i<mensaje.length; i++){
			diferencias += Util.contarBitsDiferentes(mensaje[i], mensaje_descifrado_2[i]);
		}
		System.out.println("Han cambiado " + diferencias + " bits");
	}
	
	public static void ruidoCBC() {
		byte[] mensaje = Util.stringToBytes("Este es un texto de ejemplo largo que ocupa 48 B");
		byte[] clave = Util.hexStringToBytes("2b7e151628aed2a6abf7158809cf4f3c");
		byte[] mensaje_cifrado = ModoCBC.cifrar(clave, mensaje);
		System.out.println("Mensaje cifrado: " + Util.bytesToHexString(mensaje_cifrado));
		byte[] mensaje_descifrado = ModoCBC.descifrar(clave,mensaje_cifrado);
		System.out.println("Mensaje descifrado: " + Util.bytesToString(mensaje_descifrado));
		byte[] mensaje_cifrado_2 = mensaje_cifrado;
		mensaje_cifrado_2[21] = Util.cambiarBit(mensaje_cifrado_2[21], 6);
		System.out.println("Tras cambiar bit en mensaje cifrado");
		System.out.println("Mensaje cifrado: " + Util.bytesToHexString(mensaje_cifrado));
		byte[] mensaje_descifrado_2 = ModoCBC.descifrar(clave,mensaje_cifrado_2);
		System.out.println("Mensaje descifrado: " + Util.bytesToString(mensaje_descifrado_2));
		int diferencias = 0;
		for(int i = 0; i<mensaje.length; i++){
			diferencias += Util.contarBitsDiferentes(mensaje[i], mensaje_descifrado_2[i]);
		}
		System.out.println("Han cambiado " + diferencias + " bits");
	}
	
	public static void main(String[] args){
		System.out.println("--- Ruido en ECB ---");
		ruidoECB();
		System.out.println("\n--- Ruido en CTR ---");
		ruidoCTR();
		System.out.println("\n--- Ruido en CBC ---");
		ruidoCBC();
	}
	
}
