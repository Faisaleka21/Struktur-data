/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal5;

public class cek {
    public static boolean identitas(int[][] matrik) {
        if(matrik.length != 3 || matrik[0].length !=3 ){
            return false;
        }
        
         // Memeriksa elemen-elemen diagonal
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (i == j && matrik[i][j] != 1) {
                    return false;
                } else if (i != j && matrik[i][j] != 0){
                    return false;
        }
      }
    }
        return true;    
}
}
