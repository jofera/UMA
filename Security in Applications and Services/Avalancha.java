package uma.seguridad;

public class Avalancha {
	
	public static void avalanchaECB() {
		byte[] mensaje = Util.stringToBytes("Este es un texto de ejemplo largo que ocupa 48 B");
		byte[] clave = Util.hexStringToBytes("2b7e151628aed2a6abf7158809cf4f3c");
		byte[] mensaje_cifrado = ModoECB.cifrar(clave, mensaje);
		System.out.println("Mensaje cifrado: " + Util.bytesToHexString(mensaje_cifrado));
		byte[] mensaje_descifrado = ModoECB.descifrar(clave,mensaje_cifrado);
		System.out.println("Mensaje descifrado: " + Util.bytesToString(mensaje_descifrado));
		mensaje[21] = Util.cambiarBit(mensaje[21], 6);
		byte[] mensaje_cifrado_2 = ModoECB.cifrar(clave,mensaje);
		System.out.println("Tras cambiar bit");
		System.out.println("Mensaje cifrado: " + Util.bytesToHexString(mensaje_cifrado_2));
		byte[] mensaje_descifrado_2 = ModoECB.descifrar(clave,mensaje_cifrado_2);
		System.out.println("Mensaje descifrado: " + Util.bytesToString(mensaje_descifrado_2));
		int diferencias = 0;
		for(int i = 0; i<mensaje.length; i++){
			diferencias += Util.contarBitsDiferentes(mensaje_cifrado[i], mensaje_cifrado_2[i]);
		}
		System.out.println("Han cambiado " + diferencias + " bits");
	}
	
	public static void avalanchaCTR(){
		byte[] mensaje = Util.stringToBytes("Este es un texto de ejemplo largo que ocupa 48 B");
		byte[] clave = Util.hexStringToBytes("2b7e151628aed2a6abf7158809cf4f3c");
		byte[] mensaje_cifrado = ModoCTR.cifrar(clave, mensaje);
		System.out.println("Mensaje cifrado: " + Util.bytesToHexString(mensaje_cifrado));
		byte[] mensaje_descifrado = ModoCTR.descifrar(clave,mensaje_cifrado);
		System.out.println("Mensaje descifrado: " + Util.bytesToString(mensaje_descifrado));
		mensaje[21] = Util.cambiarBit(mensaje[21], 6);
		byte[] mensaje_cifrado_2 = ModoCTR.cifrar(clave,mensaje);
		System.out.println("Tras cambiar bit");
		System.out.println("Mensaje cifrado: " + Util.bytesToHexString(mensaje_cifrado_2));
		byte[] mensaje_descifrado_2 = ModoCTR.descifrar(clave,mensaje_cifrado_2);
		System.out.println("Mensaje descifrado: " + Util.bytesToString(mensaje_descifrado_2));
		int diferencias = 0;
		for(int i = 0; i<mensaje.length;i++){
			diferencias += Util.contarBitsDiferentes(mensaje_cifrado[i], mensaje_cifrado_2[i]);
		}
		System.out.println("Han cambiado " + diferencias + " bits");
	}
	
	public static void avalanchaCBC(){
		byte[] mensaje = Util.stringToBytes("Este es un texto de ejemplo largo que ocupa 48 B");
		byte[] clave = Util.hexStringToBytes("2b7e151628aed2a6abf7158809cf4f3c");
		byte[] mensaje_cifrado = ModoCBC.cifrar(clave,mensaje);
		System.out.println("Mensaje cifrado: " + Util.bytesToHexString(mensaje_cifrado));
		byte[] mensaje_descifrado = ModoCBC.descifrar(clave,mensaje_cifrado);
		System.out.println("Mensaje descifrado: " + Util.bytesToString(mensaje_descifrado));
		mensaje[21]=Util.cambiarBit(mensaje[21],6 );
		byte[] mensaje_cifrado2 = ModoCBC.cifrar(clave,mensaje);
		System.out.println("Tras cambiar bit");
		System.out.println("Mensaje cifrado: " + Util.bytesToHexString(mensaje_cifrado2));
		
		int diferencias = 0;
		for(int i = 0; i<mensaje_cifrado.length;i++){
			diferencias += Util.contarBitsDiferentes(mensaje_cifrado[i], mensaje_cifrado2[i]);
		}
		byte[] mensaje_descifrado2 = ModoCBC.descifrar(clave,mensaje_cifrado2);
		System.out.println("Mensaje descifrado: " + Util.bytesToString(mensaje_descifrado2));
		System.out.println("Han cambiado " + diferencias + " bits");
	}
	
	public static void main(String[] args){
		System.out.println("--- Avalancha en ECB ---");
		avalanchaECB();
		System.out.println("\n--- Avalancha en CTR ---");
		avalanchaCTR();
		System.out.println("\n--- Avalancha en CBC ---");
		avalanchaCBC();
	}
	
}
