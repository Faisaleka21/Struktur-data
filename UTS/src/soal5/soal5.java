/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal5;

import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("||  MENGECEK MATRIKS 3X3 : IDENTITAS/BUKAN  ||");
        System.out.println("----------------------------------------------");
        System.out.println("||           ISI DENGAN ANGKA 0/1           ||");
        System.out.println("=============================================="); 
        int[][] a=new int[3][3];
        int i,j;
        
        //mengisi nilai elemen
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print("Masukkan nilai baris ke["+(i+1)+"], kolom ke["+(j+1)+"] : ");
                a[i][j]=z.nextInt();
            }
            System.out.println("=============================================="); 
        }
        
        //output nilai yg setelah diisi
      for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        System.out.println("=============================================="); 
      
      //pemanggilan class
      cek objek=new cek();
      boolean benar=objek.identitas(a);
      
      //output hasil matriks
      if(benar){
          System.out.println("Matriks : Identitas");
      } else{
          System.out.println("Matriks : Tidak Identitas");
      }
      System.out.println("=============================================="); 
   }
}
