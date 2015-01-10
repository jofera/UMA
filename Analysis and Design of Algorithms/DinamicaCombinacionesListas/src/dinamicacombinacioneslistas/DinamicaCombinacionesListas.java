/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamicacombinacioneslistas;

/**
 *
 * @author Gonzalo
 * Ejercicio examen ADA Febrero 2014
 */
public class DinamicaCombinacionesListas {
    
    public static int numOp(int i, int j, int k){
        return Math.min(
                (i + j) numOp
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] l = new int[3];
        l[0] = 30;
        l[1] = 20;
        l[2] = 10;
        
        System.out.println("Numero minimo de operaciones: " + numOp(l[0],l[1],l[2]));
    }
    
}
