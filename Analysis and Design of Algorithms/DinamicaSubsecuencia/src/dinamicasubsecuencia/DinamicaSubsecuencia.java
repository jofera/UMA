/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamicasubsecuencia;

/**
 *
 * @author Gonzalo
 */
public class DinamicaSubsecuencia {
    
    public enum dir {ARRIBA, DIAGONAL, IZQUIERDA};
    
    public static String recomponerSolucion(int[][] s, dir[][] d, String cad1, String cad2){
        String sol = "";
        
        int i = cad1.length();
        int j = cad2.length();
        
        while( i > 0 && j > 0){
            if(d[i][j] == dir.DIAGONAL){
                sol = cad1.charAt(i - 1) + sol;
                i--;
                j--;
            }else if(d[i][j] == dir.ARRIBA){
                i--;                
            }else{
                j--;
            }
        }
        return sol;
    }
    
    public static String resolver(String cad1, String cad2){
        int[][] s = new int[cad1.length() + 1][cad2.length() + 1];
        dir[][] d = new dir[cad1.length() + 1][cad2.length() + 1];
        
        for(int i = 0; i < cad1.length() + 1; i++)
            s[i][0] = 0;
        for(int j = 0; j < cad2.length() + 1; j++)
            s[0][j] = 0;
        
        for(int i = 1; i < cad1.length() + 1; i++){
            for(int j = 1; j < cad2.length() + 1; j++){
                if(cad1.charAt(i - 1) == cad2.charAt(j - 1)){
                    s[i][j] = 1 + s[i-1][j-1];
                    d[i][j] = dir.DIAGONAL;
                }else if(s[i-1][j] >= s[i][j-1]){
                    s[i][j] = s[i-1][j];
                    d[i][j] = dir.ARRIBA;
                }else{
                    s[i][j] = s[i][j-1];
                    d[i][j] = dir.IZQUIERDA;
                }
            }
        }
        return recomponerSolucion(s,d,cad1,cad2);        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad1 = "ACCGGTCGAGTGCGCGGAAGCCGGCCGAA";
        String cad2 = "GTCGTTCGGAATGCCGTTGCTCTGTAAA";
        String sol = resolver(cad1,cad2);
        System.out.println("Cad1: " + cad1);
        System.out.println("Cad2: " + cad2);
        System.out.println("La SCL es " + sol);
    }
    
}
