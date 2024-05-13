/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal4;

public class duplikat {
    public static int duplikat(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        
        int i,j;
        int index = 0;
        // bandingkan elemen dengan elemen berikutnya
        for (i=0; i<n; i++) {
            // Memeriksa nilai sudah ada apa belum sebelumnya dalam arr
            boolean isDuplikat = false;
            for (j=0; j<i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplikat = true;
                    break;
                }
            }
            
            // Jika elemen ke-i tidak ada sebelumnya dalam array maka tambahkan ke array sementara
            if (!isDuplikat) {
                arr[index++] = arr[i];
            }
        }
        
        return index;
    }
}
