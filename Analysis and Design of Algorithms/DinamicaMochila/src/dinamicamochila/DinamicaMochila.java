/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamicamochila;

import java.util.Arrays;

/**
 *
 * @author Gonzalo
 */
public class DinamicaMochila {
    
    public static void recomponerSolucion(int[][] t, int[][] m, int i, int c){
        if(i > 0 && t[i][c] != t[i -1][c]){
            System.out.println("Objeto " + i + " con peso " + m[i][0] + " y valor " + m[i][1]);
            recomponerSolucion(t,m,i - 1,c - m[i][0]);
        }else if (i == 0){
            if(t[i][c] != 0)
                System.out.println("Objeto " + i + " con peso " + m[i][0] + " y valor " + m[i][1]);
        }else{
            recomponerSolucion(t,m,i - 1,c);
        }
    }
    
    public static void imprimirArray(int[][] t){
        for(int i = 0; i < t.length; i++)
            System.out.println(Arrays.toString(t[i]));
    }
    
    public static int[][] resolver(int[][] m, int c){
        int[][] s = new int[m.length][c + 1];
        
        /* Si la capacidad es 0, el valor máximo es 0 */
        for(int i = 0; i < m.length; i++){
            s[i][0] = 0;
        }
        
        for(int i = 0; i < m.length; i++){
            for(int j = 1; j < c + 1; j++){
                /* Si es el objeto menos pesado, y no cabe en la mochila: -1 */
                if(i == 0 && j < m[i][0]){
                    s[i][j] = 0;
                }else if(i == 0){
                    /* Es el objeto menos pesado, y además cabe en la mochila */
                    s[i][j] = m[i][1];
                }else if(j < m[i][0]){
                    /* El objeto no cabe en la mochila. Miro arriba */
                    s[i][j] = s[i-1][j];
                }else{
                    /* El objeto cabe en la mochila. Busco el valor máximo */
                    s[i][j] = Math.max(s[i-1][j], m[i][1] + s[i - 1][j - m[i][0]]);
                }
            }
        }
        imprimirArray(s);
        recomponerSolucion(s,m,m.length - 1,c);
        return s;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        
//        int[][] mochila = new int[4][2];
//        mochila[0][0] = 2; /* Peso */
//        mochila[0][1] = 12; /* Valor */
//        mochila[1][0] = 1; /* Peso */
//        mochila[1][1] = 10; /* Valor */
//        mochila[2][0] = 3; /* Peso */
//        mochila[2][1] = 20; /* Valor */
//        mochila[3][0] = 2; /* Peso */
//        mochila[3][1] = 15; /* Valor */
//        
//        int capacidad = 5;
        
        int[][] s = new int[mochila.length][capacidad];
        
        s = resolver(mochila, capacidad);        
    }
    
}
