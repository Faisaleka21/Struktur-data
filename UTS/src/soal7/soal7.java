/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal7;

import java.util.Scanner;
public class soal7 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("||       PENGURUTAN ARRAY SECARA ALFABETIS       ||");
        System.out.println("---------------------------------------------------");
        System.out.println("||  INSERTION SORT, SELECTION SORT, BUBBLE SORT  ||");
        System.out.println("===================================================");

         
        String[] nama;
        int a;
        
        System.out.print("Masukkan Jumlah Nama : ");
        a=z.nextInt();
          z.nextLine();
        
        nama=new String[a];
        //pemanggilan class
        bubble bbl=new bubble();
        insertion ins=new insertion();
        selection slc=new selection();
        
        //masukan nama
        int i;
        for(i=0; i<a; i++){
            System.out.print("Nama ke-"+(i+1)+" : ");
            nama[i]=z.nextLine();
        }
        //tampilan nama
        System.out.println("Daftar Nama: ");
        for(i=0; i<a; i++){
            System.out.print((i+1)+"."+nama[i]+" ");
        }
        System.out.println("");
        
        //bubble
       bbl.bubble(nama);
        //output bubble
        System.out.println("Bubble :");
        for(i=0; i<a; i++){
            System.out.println((i+1)+"."+nama[i]);
        }
        
        //insertion
        ins.insertion(nama);
        //output insertion
        System.out.println("Insertion");
        for(i=0; i<a; i++){
            System.out.println((i+1)+"."+nama[i]);
        }
        
        //selection
        slc.selection(nama);
        //output selection
        System.out.println("Selection");
        for(i=0; i<a; i++){
            System.out.println((i+1)+"."+nama[i]);
        }
        
        System.out.println("");
    }
}
