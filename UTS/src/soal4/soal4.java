/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal4;

import java.util.Scanner;
public class soal4 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("||  MENGHAPUS DUPLIKAT DARI ARRAY INTEGER  ||");
        System.out.println("=============================================");
        
        int a;
        int i;
        //memasukkan nilai
        System.out.print("Masukkan Jumlah Nilai : ");
        a=z.nextInt();
        System.out.println("=============================================");
        
        int[] k=new int[a];        
        System.out.println("Masukkan nilai ");
        for(i=0; i<a; i++){
            System.out.print((i+1)+".");
            k[i]=z.nextInt();
        }
        //output nilai setelah diinput
        System.out.println("=============================================");
        System.out.println("Nilai Sebelum Diduplikat ");
        for(i=0; i<a; i++){
            System.out.print((k[i])+" ");
        }
        System.out.println("");
        System.out.println("---------------------------------------------");
                
        //memanggil class
        duplikat dpl=new duplikat();
        //hapus duplikat
        a=dpl.duplikat(k,a);
        
        //output stlh hapus duplkat
        System.out.println("Nilai Sesudah Hapus Duplikat");
        for(i=0; i<a; i++){
            System.out.print(k[i]+" ");
        }
        System.out.println("");
        System.out.println("=============================================");        
    }
}
