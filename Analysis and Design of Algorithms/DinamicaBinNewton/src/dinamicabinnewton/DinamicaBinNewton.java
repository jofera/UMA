/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamicabinnewton;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class DinamicaBinNewton {
    
    public static int resolver(int n, int k){
        int t[][] = new int[n + 1][k + 1];
        int c = 0;
        
        for(int i = 0; i < k + 1; i++){
            t[0][i] = 1;
            c++;
        }
        
        for(int i = 0; i < n + 1; i++){
            t[i][0] = 1;
            c++;
        }
        
        for(int i = 1; i < n + 1; i++){
            for (int j = 1; j < k + 1; j++){
                if(i == j){
                    t[i][j] = 1;
                    c++;
                }else{
                    t[i][j] = t[i-1][j-1] + t[i-1][j];
                    c++;
                }
            }
        }
        System.out.println("Se han hecho " + c + " calculos");
        return t[n][k];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca n: ");
        int n = new Integer(sc.nextLine());
        System.out.print("Introduzca k: ");
        int k = new Integer(sc.nextLine());
        
        System.out.println("Calculando el binominio de newton de " + n + " y " + k);
        System.out.println("El resultado es " + resolver(n,k));
    }
    
}
