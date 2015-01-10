/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamicanotas;

import java.util.Arrays;

/**
 *
 * @author Gonzalo
 */
public class DinamicaNotas {
    
    public enum dir {ARRIBA,DIAGONAL,IZQUIERDA};
    
    public static void imprimirArray(int[][] t){
        for(int i = 0; i < t.length; i++)
            System.out.println(Arrays.toString(t[i]));
    }
    
    public static void recomponer(int[][] s, int[][] c, dir[][]d, int a, int h){
        int i = a;
        int j = h;
        
        while(i > 0 && j > 0){
            /*
            switch(d[i][j]){
                    case ARRIBA: j--;
                            break;
                    case DIAGONAL: 
                            System.out.println("1 hora de la asignatura " + i);
                            i--;
                            j--;
                            break;
                    case IZQUIERDA:
                            System.out.println("1 hora de la asignatura " + i);
                            j--;
                            break;
            }
            */
            if(d[i][j] == dir.ARRIBA){
                i--;
            }else if(d[i][j] == dir.DIAGONAL){
                System.out.println("1 hora de la asignatura " + i);
                i--;
                j--;
            }else{
                System.out.println("1 hora de la asignatura " + i);
                j--;
            }
        }
    }
    
    public static int resolver(int[][] c, int a, int h){
        int[][] s = new int[a + 1][h + 1];
        dir[][] d = new dir[a + 1][h + 1];
        for(int i = 0; i < a + 1; i++) 
            c[i][0] = 0;
        for(int j = 0; j < h + 1; j++){
            c[0][j] = 0;
        }
        for(int i = 1; i < a + 1; i++){
            for(int j = 1; j < h + 1; j++){
                
                if(s[i - 1][j] >= (c[i][j] + s[i - 1][j - 1]) || s[i - 1][j] >= (c[i][j] + s[i - 1][j])){
                    s[i][j] = s[i - 1][j];
                    d[i][j] = dir.ARRIBA;
                }else if(s[i - 1][j] < (c[i][j] + s[i - 1][j])){
                    s[i][j] = c[i][j] + s[i - 1][j];
                    d[i][j] = dir.IZQUIERDA;
                }else{
                    s[i][j] = c[i][j] + s[i - 1][j - 1];
                    d[i][j] = dir.DIAGONAL;
                }
                
                
            }
        }
        imprimirArray(s);
        recomponer(s,c,d,a,h);
        return s[a][h];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5;
        int h = 5;
        int[][] c = new int[a + 1][h + 1];
        for(int i = 0; i < a + 1; i++) 
            c[i][0] = 0;
        for(int j = 0; j < h + 1; j++){
            c[0][j] = 0;
        }
        c[1][1] = 3;
        c[1][2] = 5;
        c[1][3] = 7;
        c[1][4] = 9;
        c[1][5] = 12;
        c[2][1] = 2;
        c[2][2] = 7;
        c[2][3] = 8;
        c[2][4] = 10;
        c[2][5] = 13;
        c[3][1] = 1;
        c[3][2] = 2;
        c[3][3] = 3;
        c[3][4] = 4;
        c[3][5] = 5;
        c[4][1] = 4;
        c[4][2] = 5;
        c[4][3] = 7;
        c[4][4] = 11;
        c[4][5] = 12;
        c[5][1] = 3;
        c[5][2] = 8;
        c[5][3] = 12;
        c[5][4] = 14;
        c[5][5] = 15;
        resolver(c,a,h);
    }
    
}
