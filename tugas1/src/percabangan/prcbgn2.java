/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

import java.util.Scanner;//clas input
public class prcbgn2 {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);//variabel input
        int c;
        
        System.out.println("================================");
        System.out.println("||     Mata Kuliah Ilkom      ||");    
        System.out.println("================================");
        System.out.println("Pilih Hari :");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.print("Masukkan Pilihan : ");
        c = z.nextInt();//inputan
            
        System.out.println("================================");
        switch(c){
                case 1:
                    System.out.println("1. Struktur Data                :12.50-15.20");
                    break;
                case 2:
                    System.out.println("1. Aljabar dan Matriks          :7.50-10.20");
                    System.out.println("2. Bahasa Inggris               :10.21-12.00");
                    break;
                case 3:
                    System.out.println("1. Islam Nusantara              :8.40-10.20");
                    System.out.println("2. Pendidikan Kewarganegaraan   :10.21-12.00");
                    break;
                case 4:
                    System.out.println("1. Sistem Digital               :7.50-9.30");
                    System.out.println("2. Kalkulus 2                   :9.31-12.00");
                    System.out.println("3. Matematika Diskrit           :12.50-14.30");
                    break;
        }
    }
}
