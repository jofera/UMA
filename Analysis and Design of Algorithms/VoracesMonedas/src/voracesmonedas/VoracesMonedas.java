/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voracesmonedas;

import java.util.ArrayList;

/**
 *
 * @author Gonzalo
 */
public class VoracesMonedas {
    
    /* Función de selección. Busca la mayor moneda x tal que x <= c */
    public static int seleccion(int[] m, int c){
        int i = m.length - 1;
        while(m[i] > c && i > 0) i--;
        return (m[i] <= c) ? i : -1;
    }

    
    public static void resolver(int[] m, int c){
        
        int restante = c;
        int[] solucion = new int[m.length + 1];
        int moneda = seleccion(m, restante);
        /* Función solución: Mientras quede cambio pendiente
           no he terminado de resolver el problema
        */
        while(restante > 0 && moneda != -1){
            restante -= m[moneda];
            solucion[moneda]++;
            moneda = seleccion(m,restante);
        }
        
        for(int i = 0; i < solucion.length - 1; i++){
            System.out.println("Monedas de valor " + m[i] + " = " + solucion[i]);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cantidad = 20;
        int[] monedas = {2,4,6}; /* Candidatos */
        
        resolver(monedas, cantidad);
    }
    
}
