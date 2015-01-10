package uma.seguridad;

public class ModoCBC_Padding {

	static String bloque_inicial = "000102030405060708090A0B0C0D0E0F";

	public static byte[] cifrar(byte[] clave, byte[] mensaje) {
		int cont = 0;
		byte[] mensajeCifrado;
		byte[] ultimo_bloque = new byte[AES128.TAM_BLOQUE_BYTES];
		int tam_ultimo_bloque = 0;

		if(mensaje.length % 16 != 0){
			int resto = mensaje.length % 16;
			mensajeCifrado = new byte[mensaje.length + 16 - resto]; 
		}else{
			mensajeCifrado = new byte[mensaje.length + 16];
			ultimo_bloque = Util.hexStringToBytes("0F0F0F0F0F0F0F0F0F0F0F0F0F0F0F0F");
		}

		byte[] bloque_xor;
		byte[] bloque_cifrado;
		byte[] bloque_i = new byte[AES128.TAM_BLOQUE_BYTES];

		/* El mensaje no llega a ocupar un bloque completo */
		if(mensaje.length < AES128.TAM_BLOQUE_BYTES){
			System.arraycopy(mensaje, cont, bloque_i, 0, mensaje.length);
			String padding = "0" + Integer.toHexString(AES128.TAM_BLOQUE_BYTES - mensaje.length);
			int cont2 = 1;
			while(cont2 < (AES128.TAM_BLOQUE_BYTES - mensaje.length)){
				padding += "0" + Integer.toHexString(AES128.TAM_BLOQUE_BYTES - mensaje.length);
				cont2++;
			}
			/* Añado padding al bloque */
			System.arraycopy(Util.hexStringToBytes(padding), 0, bloque_i, mensaje.length, cont2);
			bloque_xor = Util.xor(bloque_i, Util.hexStringToBytes(bloque_inicial));
			bloque_cifrado = AES128.cifrarBloque(clave, bloque_xor);
			System.arraycopy(bloque_cifrado, 0, mensajeCifrado, cont, AES128.TAM_BLOQUE_BYTES);
			cont+=AES128.TAM_BLOQUE_BYTES;
		}else{
			System.arraycopy(mensaje, cont, bloque_i, 0, AES128.TAM_BLOQUE_BYTES);
			bloque_xor = Util.xor(bloque_i, Util.hexStringToBytes(bloque_inicial));
			bloque_cifrado = AES128.cifrarBloque(clave, bloque_xor);
			System.arraycopy(bloque_cifrado, 0, mensajeCifrado, cont, AES128.TAM_BLOQUE_BYTES);
			cont+=AES128.TAM_BLOQUE_BYTES;
		}

		while(cont < mensaje.length){
			/* Última iteración y necesita padding */
			if(((cont + AES128.TAM_BLOQUE_BYTES) > (mensaje.length + 16)) && (mensaje.length % 16 != 0)){
				tam_ultimo_bloque = mensaje.length - cont;
				String padding = "0" + Integer.toHexString(AES128.TAM_BLOQUE_BYTES - tam_ultimo_bloque);
				bloque_i = new byte[AES128.TAM_BLOQUE_BYTES];
				System.arraycopy(mensaje, cont, bloque_i, 0, tam_ultimo_bloque);
				int cont2 = 1;
				while(cont2 < (AES128.TAM_BLOQUE_BYTES - tam_ultimo_bloque)){
					padding += "0" + Integer.toHexString(AES128.TAM_BLOQUE_BYTES - tam_ultimo_bloque);
				}
				System.arraycopy(Util.hexStringToBytes(padding), 0, bloque_i, tam_ultimo_bloque, cont2);
			}else{
				bloque_i = new byte[AES128.TAM_BLOQUE_BYTES];
				System.arraycopy(mensaje, cont, bloque_i, 0, AES128.TAM_BLOQUE_BYTES);
			}
			bloque_xor = Util.xor(bloque_i, bloque_cifrado);
			bloque_cifrado = AES128.cifrarBloque(clave, bloque_xor);
			System.arraycopy(bloque_cifrado, 0, mensajeCifrado, cont, AES128.TAM_BLOQUE_BYTES);			
			cont+=AES128.TAM_BLOQUE_BYTES;
		}

		if(mensaje.length % 16 == 0){
			bloque_xor = Util.xor(ultimo_bloque, bloque_cifrado);
			bloque_cifrado = AES128.cifrarBloque(clave, bloque_xor);
			System.arraycopy(bloque_cifrado, 0, mensajeCifrado, mensaje.length-AES128.TAM_BLOQUE_BYTES, AES128.TAM_BLOQUE_BYTES);
		}

		return mensajeCifrado;
	}

	public static byte[] descifrar(byte[] clave, byte[] mensaje){
		int i = 0;

		byte[] bloque_i = new byte[AES128.TAM_BLOQUE_BYTES];
		byte[] bloque_copia = new byte[AES128.TAM_BLOQUE_BYTES];
		System.arraycopy(mensaje, i, bloque_i, 0, AES128.TAM_BLOQUE_BYTES);
		System.arraycopy(mensaje, i, bloque_copia, 0, AES128.TAM_BLOQUE_BYTES);
		byte[] bloque_cifrado = AES128.descifrarBloque(clave, bloque_i);
		bloque_cifrado = Util.xor(Util.hexStringToBytes(bloque_inicial), bloque_cifrado);

		System.arraycopy(bloque_cifrado, 0, mensaje, i, AES128.TAM_BLOQUE_BYTES);
		i += AES128.TAM_BLOQUE_BYTES;
		while(i < mensaje.length){
			System.arraycopy(mensaje, i, bloque_i, 0, AES128.TAM_BLOQUE_BYTES);
			bloque_cifrado = AES128.descifrarBloque(clave, bloque_i);
			bloque_cifrado = Util.xor(bloque_copia, bloque_cifrado);

			System.arraycopy(mensaje, i, bloque_copia, 0, AES128.TAM_BLOQUE_BYTES);
			System.arraycopy(bloque_cifrado, 0, mensaje, i, AES128.TAM_BLOQUE_BYTES);
			i+=AES128.TAM_BLOQUE_BYTES;
		}

		mensaje = Util.hexStringToBytes(quitar_padding(Util.bytesToHexString(mensaje)));

		return mensaje;
	}

	private static String quitar_padding(String mensaje) {
		int resultado  = 0;
		char ultima_letra = mensaje.charAt(mensaje.length()-1);
		
		for(int i = 0; i < 17; i++)
			if(ultima_letra == Integer.toHexString(i).charAt(0)) resultado = i;
		mensaje = mensaje.substring(0, mensaje.length() - resultado * 2);
		
		return mensaje;
	}

	public static void main(String[] args) {
		byte[] k = Util.hexStringToBytes("2b7e151628aed2a6abf7158809cf4f3c"); 
		byte[] m = Util.stringToBytes("Ejemplo"); 
		byte[] c = ModoCBC_Padding.cifrar(k, m); 
		System.out.println("c = " + Util.bytesToHexString(c));
	}

}
