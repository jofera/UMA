/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamicamonedas;
import static java.lang.Integer.min;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Gonzalo
 */
public class DinamicaMonedas {
    
    public static void imprimirArray(int[][] t){
        for(int i = 0; i < t.length; i++)
            System.out.println(Arrays.toString(t[i]));
    }
    
    public static void recomponerSolucion(int[][] t, int[] monedas, int cantidad){
        int s[] = new int[monedas.length];
        for(int i = 0; i < s.length; i++){
            s[i] = 0;
        }
        for(int i = monedas.length - 1; i >= 0; i--){
            if(i > 0 && t[i][cantidad] != t[i - 1][cantidad]){
                /* Se utiliza la moneda */
                s[i] += (int) (cantidad / monedas[i]);
                cantidad -= (int) (cantidad / monedas[i]) * monedas[i];
            }else{
                /* No se utiliza la moneda */   
                s[i] += (int) (cantidad / monedas[i]);
            }
        }
        for(int i = 0; i < monedas.length; i++){
            System.out.println("Moneda " + monedas[i] + ": " + s[i]);
        }
    }
   
    public static int resolver(int cantidad, int[] monedas){
        int t[][] = new int[monedas.length][cantidad + 1];
        
        for(int f = 0; f < monedas.length; f++){
            /* Para pagar la cantidad 0 se necesitan 0 monedas */
            t[f][0] = 0;
        }
        
        for(int f = 0; f < monedas.length; f++){
            for(int c = 1; c < cantidad + 1; c++){
                if(f == 0 && c < monedas[0]){
                    /* no se puede pagar esta cantidad con ninguna moneda*/
                    t[f][c] = -1;
                }else if(f == 0){
                    t[f][c] = 1 + t[f][c - monedas[0]];
                }else if(c < monedas[f]){
                    /* La cantidad c es menor que el valor de la moneda */
                    /* No podemos pagar con esta, pagamos con otra moneda */
                    t[f][c] = t[f-1][c];
                }else{
                    /* La moneda actual nos permite pagar esta cantidad */
                    /* Vemos si es mejor pagar con esta (menor numero) */
                    /* O bien con otra */
                    t[f][c] = min(t[f-1][c], 1 + t[f][c - monedas[f]]);
                }
            }
        }
        imprimirArray(t);
        recomponerSolucion(t, monedas, cantidad);
        return t[monedas.length-1][cantidad];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantidad = 20;
        int[] monedas = {2,4,6};
                        
        System.out.println("Para devolver la cantidad " + cantidad + " se necesitan " + resolver(cantidad, monedas) + " monedas.");
        
    }
    
}
