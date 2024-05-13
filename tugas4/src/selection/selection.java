/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selection;

//diedit lk iso tugas 4
public class selection {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("||        SELECTION SORT        ||");
        System.out.println("==================================");
        int a[]= {2,5,8,90,4,3,2};
        
        //rumus selection
        int i,j;
        for (i=0; i<a.length; i++){
            int z=i;
            for(j=i+1; j<a.length; j++){
                if(a[j]<a[z]){
                    z=j;
                }
            }
            //menukar elemen terkecil dengan elemn pertama yg belum terurutkan
            int k=a[z];
            a[z]=a[i];
            a[i]=k;
        }
        for(i=0; i<a.length; i++)
        System.out.print(a[i]+" ");
        System.out.println(" ");
        System.out.println("==================================");
        System.out.println("                OKE               ");
    }
}
