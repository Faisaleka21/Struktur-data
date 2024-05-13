/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

import java.util.Scanner;//class input
public class prcbgn1 {
    public static void main(String[] args) {
        
        Scanner z= new Scanner(System.in);//variabel input
        String a,b;
        String nama;
        int c;
        
        System.out.println("================================");
        System.out.println("||      Tempat Beribadah      ||");    
        System.out.println("================================");
        System.out.println("Pilih Jenis Kelamin :");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        System.out.print("Masukkan Pilihan : ");
        c = z.nextInt();//untuk inputan tipe data angka.
            z.nextLine();//karena inputan objek lainnya/untuk inputan tipe data string.
        
        if(c==1){
            System.out.println("Masukkan Nama  : ");
            a=z.nextLine();
            System.out.println("Masukkan Prody : ");
            b=z.nextLine();
            System.out.println("Nama "+a+" prody "+b+" Jenis kelamin Laki-laki tempat ibadah di sebelah Utara depan Kantin.");

        }
        else if(c==2){
            System.out.println("Masukkan Nama  : ");
            a=z.nextLine();
            System.out.println("Masukkan Prody : ");
            b=z.nextLine();
            System.out.println("Nama "+a+" prody "+b+" Jenis kelamin Perempuan tempat ibadah di sebelah Selatan depan Perpustakaan.");

        }
        else{
            System.out.println("Tidak ada pilihan");
        }
        }
}
