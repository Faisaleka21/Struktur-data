/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perulangan;

import java.util.Scanner;
public class prlngn3 {
    public static void main(String[] args) {
      
        Scanner angka= new Scanner(System.in);//variabel untuk input
                int a;
                int b;
                char c;
        
                
        System.out.println("==============================");
        System.out.println("||         OPERATOR          ||");
        System.out.println("==============================");
        
        do{
        System.out.print("masukkan nilai a = ");
        a=angka.nextInt();//inputan
        System.out.print("masukkan nilai b = ");
        b=angka.nextInt();
        System.out.println("");
        
        //operator
        int tambah      = a+b;
        int kurang      = a-b;
        int pembagian   = a/b;
        int perkalian   = a*b;
        int modulus     = a%b;
        System.out.println("===============================");
        System.out.println("Pejumlahan  = "+a+"+"+b+"="+tambah);
        System.out.println("Pengurangan = "+a+"-"+b+"="+kurang);
        System.out.println("Pembagian   = "+a+"/"+b+"="+pembagian);
        System.out.println("Perkalian   = "+a+"*"+b+"="+perkalian);
        System.out.println("Modulus     = "+a+"%"+b+"="+modulus);
            
        System.out.println("");
            System.out.print("Mengulang Lagi (y/n) : ");
            c=angka.next().charAt(0);//0: deklarasikan indeks pertama. misal "ok"=charAt(0) maka mucul "o". jika charAt(1) maka muncul k.  
        
     } while (c=='Y'||c=='y');

        System.out.println("Selesai!!!!!!!1");
    }
}
 
    

