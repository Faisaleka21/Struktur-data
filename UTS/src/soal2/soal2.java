/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

public class soal2 {
    public static void main(String[] args) {
        System.out.println("====================================================");
        System.out.println("||  MENGGABUNGKAN 2 ARRAY INT MENJADI ARRAY BARU  ||");
        System.out.println("====================================================");
        
        int[] a={1,2,3,4,5};
        int[] b={6,7,8,9,10};
        System.out.println("Array Pertama : {1,2,3,4,5}");
        System.out.println("Array Kedua   : {6,7,8,9,10}");
        System.out.println("====================================================");
        //memuat arry baru dngn panjng total kedua arry a b 
        int arr1=a.length;
        int arr2=b.length;
        int[] gabungan=new int [arr1+arr2];
        
        int i;
        //salin arry a ke gabungan
        for(i=0; i<arr1; i++){
            gabungan[i]=a[i];
        }
        
        //salin arry b ke gabungan
        for(i=0; i<arr2; i++){
            gabungan[arr1+i]=b[i];
        }
        
        //tampilan
        System.out.println("Tampilan gabungan ke 2 array :");
        for(i=0; i<gabungan.length; i++){
            System.out.print(gabungan[i]+",");
        }
        System.out.println("");
    }
}
