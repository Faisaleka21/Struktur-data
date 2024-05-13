/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble;

public class bubble {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("||          BUBBLE SORT         ||");
        System.out.println("==================================");
        int a[]= {2,5,8,90,4,3,2};
        
        ///rumus bubble
        int i,j;
        for(i=0; i<a.length-1; i++ ){
            for(j=0; j<a.length-1; j++){
                if (a[j]>a[j+1]){
                    //penukaran elemen j lebih dari j+1
                int z=a[j]; //int disamping bisa diubah ke char jika angka diubah ke huruf.
                    a[j]=a[j+1];
                    a[j+1]=z;
                }
            }
        }
        //output
        System.out.println();
        for(i=0; i<a.length; i++){
            System.out.print(a[i] + ",");
        }
        
        System.out.println(" ");
        System.out.println("==================================");
        System.out.println("                OKE               ");
    }
    
}
