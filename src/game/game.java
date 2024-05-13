/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.util.Scanner;
public class game {
    public static void main(String[] args) {
       Scanner a=new Scanner(System.in);
        System.out.println("=================");
        System.out.println("|  Game Petani  |");
        System.out.println("=================");
    
        player petani=new player();
        
        System.out.print("Masukkan nama player: ");
        petani.nama=a.nextLine();
        petani.speed= 78;
        petani.healthPoin= 0;
        
        
        petani.run();
        
        if(petani.isDead()){
            System.out.println("Game Over!!!!");
        }
    }
    
}
