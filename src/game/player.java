/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

public class player {
    String nama;
    int speed;
    int healthPoin;
    
    void run(){
        System.out.println(nama+" is running....");
        System.out.println("speed       : "+speed);
        System.out.println("Health Poin : "+healthPoin);
    }
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
}
