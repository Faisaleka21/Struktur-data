/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string1;

import java.util.Scanner;
public class string1 {
    public static void main(String[] args) {
    Scanner z=new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("||    HITUNG SIMILARITY    ||");
        System.out.println("=============================");
        
        String a="apa";
        System.out.println("Kata : "+a);
        System.out.println("=============================");
        
        //mendeteksi similarity
        int b=0;
        int i,j;
        for(i=0; i<a.length(); i++){
            boolean found=false;
            for(j=i+1; j<a.length(); j++){
            if(a.charAt(i) == a.charAt(j)){
                found=true;
                break;
           }
          }
            if (!found){
                b++;
            }
        }    
        System.out.println("Jumlah karakter yang sama ");
        System.out.println(a+" = "+b);
    }
}

/*


*/