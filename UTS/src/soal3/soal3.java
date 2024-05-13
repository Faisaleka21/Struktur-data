/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

//belum clear
import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("=================================================================");
        System.out.println("||  HITUNG JUMLAH KEMUNCULAN SETIAP ELEMEN DALAM ARRAY INTEGER ||");
        System.out.println("=================================================================");
        
        int a,b,c;
        int i,j;
        System.out.print("Masukkan Jumlah Nilai Elemen : ");
        a=z.nextInt();
        
        int[] k=new int[a];
        for(i=0; i<a; i++){
            System.out.print("Nilai Elemen "+(i+1)+" : ");
            k[i]=z.nextInt();//memasukkan nilai ke array a
        }
        
        System.out.println("------------------------------------------------------------------");
        //output setelah input
        System.out.print("Nilai = ");
        for(i=0; i<a; i++){
            System.out.print(k[i]+", ");     
        }
        System.out.println("");
        System.out.println("------------------------------------------------------------------");
        
        
        //output jumlah kemunculan        
        int n=0;
        int []arr=new int[a];
        System.out.println("Jumlah Kemunculan Setiap Nilai ");
        for(i=0; i<a; i++){
            if(arr[i]==1){
                continue;
            }                               
           c=1;//inisialisasi jumlah kemunculan
            for(j=i+1; j<a; j++){
             if(k[i] == k[j]){
                c++; 
                // Mengubah nilai elemen yang sudah diperiksa menjadi -1
                arr[j] = 1;
                }   
            }
            System.out.println("("+(k[i])+") Kemunculannya = "+c++);
        }
       
        
        System.out.println("");
    }
}
