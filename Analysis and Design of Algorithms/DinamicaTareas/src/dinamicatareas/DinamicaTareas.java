/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamicatareas;

/**
 *
 * @author Gonzalo
 */
public class DinamicaTareas {
    
    public static int maxArray(int[] a){
        int m = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > a[m]) m = i;
        }
        return m;
    }
    
    public static void recomponerSolucion(int[][] s, int[][] c){
        int pos = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i][s.length - 1] > s[pos][s.length - 1])
                pos = i;
        }
        
        for(int i = s.length - 1; i > 0; i--){
            if(s[pos][i] > s[pos][i -1]){
                System.out.println("Tarea " + i + " inicio: " + c[i - 1][0] + ", fin: " + c[i - 1][1]);
            }
        }
        
    }
    
    /* Calcula el nº máximo de tareas que se pueden resolver simultáneamente */
    public static void resolver(int[][] c){
        int[][] s = new int[c.length + 1][c.length + 1];
        for(int i = 0; i < s.length; i++){
            s[i][0] = 0;
            s[0][i] = 0;
        }
        
        for(int i = 1; i < s.length; i++){
            int endTime = 0;
            for(int j = i; j < s.length; j++){
                /* Si la tarea j empieza cuando la i ha acabado */
                if(i == j){
                    s[i][j] = 1;
                    endTime = c[i - 1][1];
                }else if(c[j - 1][0] > endTime){
                    s[i][j] = 1 + s[i][j - 1];
                    endTime = c[j - 1][1];
                }else{
                    s[i][j] = s[i][j - 1];
                }
            }
        }
 
        
        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < s.length; j++){
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
        recomponerSolucion(s, c);
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
