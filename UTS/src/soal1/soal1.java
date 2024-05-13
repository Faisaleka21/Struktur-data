/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;

import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("||      PEMBALIK NILAI      ||");
        System.out.println("===============================");
        
        int i,n;
        int a,p=0;
        
        System.out.print("Masukkan jumlah nilai : ");
        a=z.nextInt();
        int []k=new int[a];//menyimpan ke dalam array
    
    for(i=0; i<a; i++){
        System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
        k[p]=z.nextInt();
        p++;//inkrement p agar nilai semua tersimpan pada indeks.
        }
    
    //otput dari inputan
        System.out.println("Tampilan inputan: ");
        for(i = 0; i < a; i++) {
            System.out.print(k[i]+","); // Menampilkan nilai inputan
        }
    
        System.out.println("");
        System.out.println("Menjadi terbalik: ");
    for(i=a-1; i>=0; i--){
        System.out.print(k[i]+",");//menampilkan nilai terbalik
        }
        System.out.println("");
    }
}
