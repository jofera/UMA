package uma.seguridad;

public class ModoCBC {
	
	static String bloque_inicial = "000102030405060708090A0B0C0D0E0F";

	public static byte[] cifrar(byte[] clave, byte[] mensaje) {
		/* Primera iteración del algoritmo, hacemos xor con bloque_inicial */
		int cont = 0;
		byte[] mensajeCifrado = new byte[mensaje.length];
		byte[] bloque_i = new byte[AES128.TAM_BLOQUE_BYTES];
		System.arraycopy(mensaje, cont, bloque_i, 0, AES128.TAM_BLOQUE_BYTES);
		byte[] bloque_xor = Util.xor(bloque_i, Util.hexStringToBytes(bloque_inicial));
		byte[] bloque_cifrado = AES128.cifrarBloque(clave, bloque_xor);
		System.arraycopy(bloque_cifrado, 0, mensajeCifrado, cont, AES128.TAM_BLOQUE_BYTES);
		cont += AES128.TAM_BLOQUE_BYTES;
		/* Resto de iteraciones, dentro del while */
		while(cont < mensaje.length - 1){
			bloque_i = new byte[AES128.TAM_BLOQUE_BYTES];
			System.arraycopy(mensaje, cont, bloque_i, 0, AES128.TAM_BLOQUE_BYTES);
			bloque_xor =  Util.xor(bloque_i,bloque_cifrado);
			bloque_cifrado = AES128.cifrarBloque(clave, bloque_xor);
			System.arraycopy(bloque_cifrado, 0, mensajeCifrado, cont, AES128.TAM_BLOQUE_BYTES);
			cont+=AES128.TAM_BLOQUE_BYTES;
		}
		return mensajeCifrado;
	}
	
    public static byte[] descifrar(byte[] key, byte[] mensajeCifrado){
    	// i es el contador del bucle for
    	int i=0;
        
    	//Variable donde vamos a guardar el bloque del mensaje por el que vamos descifrando
        byte[] bloque_i = new byte[AES128.TAM_BLOQUE_BYTES]; 
        
        //Variable donde guardamos una copia del bloque cifrado
        byte[] bloque_copia = new byte[AES128.TAM_BLOQUE_BYTES];
        
        //Copiamos el bloque cifrado del mensaje cifrado
        System.arraycopy(mensajeCifrado, i, bloque_i, 0, AES128.TAM_BLOQUE_BYTES);
        System.arraycopy(mensajeCifrado, i, bloque_copia, 0, AES128.TAM_BLOQUE_BYTES);
        
        //Desciframos el bloque 
        byte[] bloqueCifrado = AES128.descifrarBloque(key, bloque_i);
        
        //Operamos con xor para obtener el bloque con el texto en claro, como es el primer bloque utilizamos el vector
         bloqueCifrado = Util.xor(Util.hexStringToBytes(bloque_inicial),bloqueCifrado);          
         
        //Copiamos el bloque con el texto en plano
        System.arraycopy(bloqueCifrado, 0, mensajeCifrado, i, AES128.TAM_BLOQUE_BYTES);
        
        //Aumentamos i
        i+=AES128.TAM_BLOQUE_BYTES;
        
        for( ; i<mensajeCifrado.length; i+=AES128.TAM_BLOQUE_BYTES)
        {
            
            //Hacemos lo mismo que arriba pero ahora la operacion xor es con el bloque anterior sin descifrar y el nuevo descifrado
            System.arraycopy(mensajeCifrado, i, bloque_i, 0, AES128.TAM_BLOQUE_BYTES);
            bloqueCifrado = AES128.descifrarBloque(key, bloque_i);
            bloqueCifrado =  Util.xor(bloque_copia,bloqueCifrado);
            
            System.arraycopy(mensajeCifrado, i, bloque_copia, 0, AES128.TAM_BLOQUE_BYTES);
            System.arraycopy(bloqueCifrado, 0, mensajeCifrado, i, AES128.TAM_BLOQUE_BYTES);
            
        }
        
        //Devolvemos el mensaje descrifrado.
        return mensajeCifrado;
        
        
    }
	
	public static void main(String[] args){
		byte[] k = Util.hexStringToBytes("2b7e151628aed2a6abf7158809cf4f3c"); 
		byte[] m = Util.hexStringToBytes("6bc1bee22e409f96e93d7e117393172a"); 
		byte[] c = ModoCBC.cifrar(k, m); 
		System.out.println("c = " + Util.bytesToHexString(c));
	}
	
}
