/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal7;


public class insertion {
    public static void insertion(String[] array) {
        int i,j;
        int n=array.length;
        for( i=0; i<n; i++){
            String z=array[i];
            j=i-1;
            
            //pindahkan elemen 0 ke i-1 yg lbh dari z(yg dipilih} ke posisi satu langkah ke depan dari posisi ssst ini
        while (j >=0 && array[j].compareTo(z)>0){
            array[j+1]=array[j];
            j=j-1;
        }
        array[j+1]=z;
        }

    }
}
