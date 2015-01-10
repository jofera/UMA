/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voracestareas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gonzalo
 */
public class VoracesTareas {
    
    public static void resolver(int[][] c){
        quicksort(c,0,c.length-1);
        List<Integer> lista = new ArrayList<Integer>();
        int k = 0;
        lista.add(0);
        for(int i = 1; i < c.length; i++){
            if(c[i][0] >= c[k][1]){
                lista.add(i);
                k = i;
            }
        }
        for(int t : lista){
            System.out.println("Se ejecuta tarea " + t + " con inicio " + c[t][0] + " y fin " + c[t][1]);
        }
    }
    
    public static void quicksort(int A[][], int izq, int der) {
        int[] pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq; // i realiza la búsqueda de izquierda a derecha
        int j=der; // j realiza la búsqueda de derecha a izquierda
        int[] aux;

        while(i<j){            // mientras no se crucen las búsquedas
           while((A[i][1] - A[i][0]) <= (pivote[1] - pivote[0]) && i<j) 
               i++;
           while((A[j][1] - A[j][0]) > (pivote[1] - pivote[0])) 
               j--;         // busca elemento menor que pivote
           if (i<j) {                      // si no se han cruzado                      
               aux = A[i];                  // los intercambia
               A[i] = A[j];
               A[j] = aux;
           }
         }
         A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
         A[j] = pivote; // los menores a su izquierda y los mayores a su derecha
         if(izq < j-1)
            quicksort(A,izq,j-1); // ordenamos subarray izquierdo
         if(j+1 <der)
            quicksort(A,j+1,der); // ordenamos subarray derecho
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tareas = 11;
        int c[][] = new int[tareas][2];
        c[0][0] = 1;
        c[0][1] = 4;
        c[1][0] = 3;
        c[1][1] = 5;
        c[2][0] = 0;
        c[2][1] = 6;
        c[3][0] = 5;
        c[3][1] = 7;
        c[4][0] = 3;
        c[4][1] = 9;
        c[5][0] = 5;
        c[5][1] = 9;
        c[6][0] = 6;
        c[6][1] = 10;
        c[7][0] = 8;
        c[7][1] = 11;
        c[8][0] = 8;
        c[8][1] = 12;
        c[9][0] = 2;
        c[9][1] = 14;
        c[10][0] = 12;
        c[10][1] = 16;
        
        resolver(c);
    }
    
}
