/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package uma.seguridad;

import java.util.Arrays;

/**
 *
 * @author David Nuñez <dnunez (at) lcc.uma.es>
 */
public class ModoECB {
    
    
    public static byte[] cifrar(byte[] key, byte[] msg){
        
        byte[] mensajeCifrado = new byte[msg.length];
        
        
        for(int i=0; i<msg.length; i+=AES128.TAM_BLOQUE_BYTES){
            
            // Copiamos un bloque del mensaje, empezando en la posición i.
            // Recordemos que los bloques tienen longitud 16 bytes.
//            byte[] bloque = Arrays.copyOfRange(msg, i, i+AES128.TAM_BLOQUE_BYTES);
            byte[] bloque_i = new byte[AES128.TAM_BLOQUE_BYTES];
            System.arraycopy(msg, i, bloque_i, 0, AES128.TAM_BLOQUE_BYTES);
            
            byte[] bloqueCifrado = AES128.cifrarBloque(key, bloque_i);
            
            System.arraycopy(bloqueCifrado, 0, mensajeCifrado, i, AES128.TAM_BLOQUE_BYTES);
            
        }
        
        return mensajeCifrado;
    }
    
    public static byte[] descifrar(byte[] key, byte[] mensajeCifrado){
        
        byte[] mensaje = new byte[mensajeCifrado.length];
        
        
        for(int i=0; i<mensajeCifrado.length; i+=AES128.TAM_BLOQUE_BYTES){
            
            // Copiamos un bloque del mensaje, empezando en la posición i.
            // Recordemos que los bloques tienen longitud 16 bytes.
            byte[] bloque_i = new byte[AES128.TAM_BLOQUE_BYTES];
            System.arraycopy(mensajeCifrado, i, bloque_i, 0, AES128.TAM_BLOQUE_BYTES);
            
            byte[] bloqueMensaje = AES128.descifrarBloque(key, bloque_i);
            
            System.arraycopy(bloqueMensaje, 0, mensaje, i, AES128.TAM_BLOQUE_BYTES);
            
        }
        
        return mensaje;
    }
    
    
}
