/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

import java.util.Scanner;
public class panggilan {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("||     JENIS MOBIL      ||");
        System.out.println("==========================");
        
        int b,c;
        mustang m=new mustang();
        jazz j=new jazz();
        avanza v=new avanza();
        //mustang
        m.nama="Ford Mustang GT";
        m.warna="Magnetic Gray";
        m.tahun=2019;
        
        //jazz
        j.nama="Honda Jazz";
        j.warna="Putih";
        j.tahun=2022;
        
        //avanza
        v.nama="Toyota Avanza";
        v.warna="Hitam";
        v.tahun=2021;
        
        System.out.println("Mobil: ");
        System.out.println("1. Mustang");
        System.out.println("2. Jazz");
        System.out.println("3. Avanza");
        System.out.print("Pilih: ");
        b=a.nextInt();
        
        if(b==1){
            m.mustang();
            System.out.println("Nama            :"+m.nama);
            System.out.println("Warna           :"+m.warna);
            System.out.println("Tahun Keluaran  :"+m.tahun);
            System.out.println("========================");
            System.out.print("Masukkan jumlah bensin(Liter): ");
            c=a.nextInt();
             if(c>=3){
             m.berjalan();   
            }else if(c<3){
            m.berhenti();   
        }
      }
        else if(b==2){
            j.jazz();
            System.out.println("Nama            :"+j.nama);
            System.out.println("Warna           :"+j.warna);
            System.out.println("Tahun Keluaran  :"+j.tahun);
            System.out.println("========================");
            System.out.print("Masukkan jumlah bensin(Liter): ");
            c=a.nextInt();
             if(c>=3){
             m.berjalan();   
            }else if(c<3){
            m.berhenti();   
        }
        }
        else if(b==3){
            v.avanza();
            System.out.println("Nama            :"+v.nama);
            System.out.println("Warna           :"+v.warna);
            System.out.println("Tahun Keluaran  :"+v.tahun);
            System.out.println("========================");
            System.out.print("Masukkan jumlah bensin(Liter): ");
            c=a.nextInt();
             if(c>=3){
             m.berjalan();   
            }else if(c<3){
            m.berhenti();   
        }
        }
    }
    
}
