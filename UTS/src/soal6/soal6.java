/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal6;

import java.util.Scanner;
public class soal6 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("||     TRANSPOSISI MATRIKS 3X3     ||");
        System.out.println("=====================================");
        
        int b,k;
        int i,j;
        
        System.out.print("Masukkan jumlah baris : ");
        b=z.nextInt();
        System.out.print("Masukkan Junlah Kolom : ");
        k=z.nextInt();
        
        //mengisi nilai baris dan kolom
        System.out.println("=============================================");
        int a[][]= new int[b][k];
        for(i=0; i<b ;i++){
            for(j=0; j<k; j++){
            System.out.print("Masukkan nilai baris ke["+(i+1)+"], kolom ke["+(j+1)+"] : ");
            a[i][j]=z.nextInt();
            }
            System.out.println("=============================================");//memisahkan jarak baris dan kolom yang pertama dengan selanjutnya
        }
        
        //output nilai yg setelah diisi
      for(i=0; i<b; i++){
        for(j=0; j<k; j++){
            System.out.print(a[i][j]+" ");
        }
            System.out.println(" ");
        }
      
      //tranposisi
      int tranposisi[][]=new int[b][k];
      for(i=0; i<b; i++) {
            for(j=0; j<k; j++){
                tranposisi[j][i]=a[i][j];
            }
      }
      //output tranposisi
       System.out.println("================");
       System.out.println("|| Tranposisi ||");
       System.out.println("================");
       for(i=0; i<b; i++) {
            for(j=0; j<k; j++) {
                System.out.print(tranposisi[i][j]+" ");
            }
       System.out.println("");
       }
        
    }
}
