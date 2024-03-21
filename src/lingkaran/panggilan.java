/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lingkaran;

import java.util.Scanner;
public class panggilan {
    public static void main(String[] args) {
        Scanner nilai= new Scanner(System.in);
        
        System.out.println("========================");
        System.out.println("||   Luas Lingkaran   ||");
        System.out.println("========================");

        luas L=new luas();
        
        System.out.print("Masukkan nilai r(jari-jari): ");
        L.r=nilai.nextInt();
        System.out.println("Nilai PHI: "+L.phi);
        
        L.luas=L.phi*(L.r*L.r);
        System.out.println("Nilai Luas yaitu: "+L.luas);
    }
    
}
