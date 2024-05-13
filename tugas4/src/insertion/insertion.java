/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insertion;

public class insertion {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("||        INSERTION SORT        ||");
        System.out.println("==================================");
        int a[]= {2,5,8,90,4,3,2};
        
        //rumus insert
        int i,j;
        for( i=0; i<a.length; i++){
            int z=a[i];
            j=i-1;
            
            //pindahkan elemen 0 ke i-1 yg lbh dari z(yg dipilih} ke posisi satu langkah ke depan dari posisi ssst ini
        while (j >=0 && a[j]>z){
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=z;
        }
        //output
        for(i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        System.out.println("==================================");
        System.out.println("                OKE               ");
    }
    
}
