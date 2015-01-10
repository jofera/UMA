/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochilavoraces;

/**
 *
 * @author Gonzalo
 */
public class MochilaVoraces {
    
    public static int seleccion(int[][] m, int r){
        int o = m.length - 1;
        while(m[o][0] > r && o > 0) o--;
        return (m[o][0] <= r) ? o : -1;
    }
    
    /* Ordeno los elementos de la mochila en función de su relación valor-peso */
    public static void quicksort(int A[][], int izq, int der) {
        int[] pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq; // i realiza la búsqueda de izquierda a derecha
        int j=der; // j realiza la búsqueda de derecha a izquierda
        int[] aux;

        while(i<j){            // mientras no se crucen las búsquedas
           while((float)(A[i][1] / A[i][0]) <= (float)(pivote[1] / pivote[0]) && i<j) 
               i++;
           while((float)(A[j][1] / A[j][0]) > (float)(pivote[1] / pivote[0])) 
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
    
    public static void resolver(int[][] m, int c){
        int[] s = new int[m.length];
        quicksort(m,0,m.length - 1);
        int restante = c;
        int objeto = seleccion(m, restante);
        while(restante > 0 && objeto != -1){
            s[objeto]++;
            restante -= m[objeto][0];
            objeto = seleccion(m, restante);
        }
        
        for(int i = 0; i < m.length; i++){
            System.out.println("Objeto " + i + " con peso " + m[i][0] + " y valor " + m[i][0] + " = " + s[i]);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] mochila = new int[5][2];
        mochila[0][0] = 1; /* Peso */
        mochila[0][1] = 1; /* Valor */
        mochila[1][0] = 2; /* Peso */
        mochila[1][1] = 6; /* Valor */
        mochila[2][0] = 5; /* Peso */
        mochila[2][1] = 18; /* Valor */
        mochila[3][0] = 6; /* Peso */
        mochila[3][1] = 22; /* Valor */
        mochila[4][0] = 7; /* Peso */
        mochila[4][1] = 28; /* Valor */
        int capacidad = 11;
        
        resolver(mochila,capacidad);
    }
    
}
