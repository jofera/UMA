/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uma.seguridad;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author David Nuñez <dnunez (at) lcc.uma.es>
 */
public class AES128 {

    public static final int TAM_BLOQUE_BITS = 128;
    public static final int TAM_BLOQUE_BYTES = 16;
    
    /**
     * Cifra exactamente *un* bloque de 128 bits (16 bytes) con la clave dada
     *
     * @param key
     * @param datos
     * @return
     */
    public static byte[] cifrarBloque(byte[] key, byte[] block) {
        return operarBloque(Cipher.ENCRYPT_MODE, key, block);
    }
    
    /**
     * Descifra exactamente *un* bloque de 128 bits (16 bytes) con la clave dada
     *
     * @param key
     * @param datos
     * @return
     */
    public static byte[] descifrarBloque(byte[] key, byte[] block) {
        return operarBloque(Cipher.DECRYPT_MODE, key, block);
    }
    
    /**
     * Descifra exactamente *un* bloque de 128 bits (16 bytes) con la clave dada
     *
     * @param key
     * @param datos
     * @return
     */
    private static byte[] operarBloque(int modo, byte[] key, byte[] block) {
        
        if(block.length != 128/8){
            throw new IllegalArgumentException(
                    "Los bloques de AES-128 deben tener una longitud de 128 bits (16 bytes)");
        }
        
        if(key.length != 128/8){
            throw new IllegalArgumentException(
                    "Las claves de AES-128 deben tener una longitud de 128 bits (16 bytes)");
        }
        
        try {
            SecretKey k = new SecretKeySpec(key, "AES");

            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(modo, k);
            byte[] ctxt = cipher.doFinal(block);
            

            
            return ctxt;
        } catch (Exception ex) {
            Logger.getLogger(AES128.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
