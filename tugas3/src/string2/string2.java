/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string2;

import java.util.Scanner;
public class string2 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("===========================");
        System.out.println("||   DETEKSI PALINDROM   ||");
        System.out.println("===========================");
        
        String kata;
        System.out.print("Masukkan Kata : ");
        kata=z.nextLine();
        System.out.println(kata);
        
        String a = "";
        for(int i=kata.length()-1; i>-1; i--){
            char c=kata.charAt(i);
            a+=String.valueOf(c);
        }
        
        if(kata.equals(a)){
            System.out.println(kata+" : Palindrom");
        }
        else{ System.out.println(kata+" : bukan Palindrom");}
    }
    
}
