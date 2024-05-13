/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1dimensi;

public class array1 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("|| Membuat array 1 Dimensi ||");
        System.out.println("=============================");
//array 
    int a[]={1,2,3,4,5,6,7,8};
    int i;
    
    //menampilkan nilai array
    System.out.println("Nilai Array");
    for(i=0 ; i<a.length ; i++){
        System.out.println("    "+a[i]);
        }
    
    System.out.println("=============================");

//mencari nilai terendah dan tertinggi menggunakan perbandingan pada array
//nilai terendah
    int rendah=a[0];
    for(i=1 ;i<a.length ;i++){
        if(a[i]<rendah){
            rendah=a[i];
        }
    }
        System.out.println("Nilai terendah = "+rendah);
    
//nilai tertinggi 
    int tinggi=a[0];
    for(i=1 ;i<a.length ;i++){
        if(a[i]>tinggi){
            tinggi=a[i];
        }
    }
        System.out.println("Nilai tertinggi = "+tinggi);

    System.out.println("=============================");
    
//nilai rata-rata
    int nilai=0;
    for(i=0 ; i<a.length ; i++){
        nilai +=a[i];
    }
    double hasil=(double)nilai/a.length;
        System.out.println("Nilai rata-rata = "+hasil);
    }
}
