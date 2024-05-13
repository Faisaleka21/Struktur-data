/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipedata;
public class Tugas1 {

    public static void main(String[] args) {
        String nama= "Faisal";
        String prody= "Ilmu Komputer";
        String nim= "2355201027";
        String kampus="Universitas Nahdlatul Ulama Blitar";
        int semester=2;
        char kelas='A';
        int umur= 19;
        boolean Laki=true;
        
        
        System.out.println("==============================");
        System.out.println("||         Biodata          ||");
        System.out.println("==============================");
        System.out.println("Nama                     = "+nama);
        System.out.println("Prody                    = "+prody);
        System.out.println("NIM                      = "+nim);
        System.out.println("Universitas              = "+kampus);
        System.out.println("Semester/Kelas           = "+semester+kelas);
        System.out.println("Umur                     = "+umur);
        if(Laki==true){
        System.out.println("Jenis Kelamin            = Laki-laki");
        }
        
        System.out.println("");
        System.out.println("Jika dibentuk kalimat yaitu :");
        System.out.print("Perkenalkan nama saya adalah "+nama);
        System.out.print(", prodinya yaitu "+prody);
        System.out.print(", dengan NIM "+nim);
        System.out.println(". Saya sedang menempuh semester "+semester);
        System.out.print("di kampus "+kampus);
        System.out.print(" dengan kelasnya "+kelas);
        System.out.print(". Umur saya yaitu "+umur);
        System.out.println(" dengan jenis kelamin Laki-laki");
        System.out.println("=====================================");
        System.out.println("TERIMA KASIH");
        
    }
    
}
