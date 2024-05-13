/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal7;


public class selection {
    public static void selection(String[] array) {
        //rumus selection
        int i,j;
        int n=array.length;
        for (i=0; i<n; i++){
            int z=i;
            for(j=i+1; j<n; j++){
                if(array[j].compareTo(array[z])<0){
                    z=j;
                }
            }
            //menukar elemen terkecil dengan elemn pertama yg belum terurutkan
            String k=array[z];
            array[z]=array[i];
            array[i]=k;
        }
    }
}
