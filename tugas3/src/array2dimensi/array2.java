/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array2dimensi;

import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
    Scanner z=new Scanner(System.in);
   
        System.out.println("=========================");
        System.out.println("||   Array 2 Dimensi   ||");
        System.out.println("=========================");

        int b,k;
        System.out.print("Masukkan Jumlah Baris : ");
        b=z.nextInt();
        System.out.print("Masukkan Jumlah Kolom : ");
        k=z.nextInt();
        
        //mengisi nilai baris dan kolom
        System.out.println("=============================================");
        int a[][]= new int[b][k];
        int i,j;
        for(i=0; i<b ;i++){
            for(j=0; j<k; j++){
            System.out.print("Masukkan nilai baris ke["+(i+1)+"], kolom ke["+(j+1)+"] : ");
            a[i][j]=z.nextInt();
            }
            System.out.println("=============================================");//memisahkan jarak baris dan kolom yang pertama dengan selanjutnya
        }
        
        System.out.println("     Tampilan Array      ");
        System.out.println("=========================");
        System.out.println(" ");
        
        //tamplan array
        for(i=0; i<b; i++){
        for(j=0; j<k; j++){
            System.out.print(a[i][j]+" ");
        }
            System.out.println(" ");
        }
        System.out.println("");
 }
}
