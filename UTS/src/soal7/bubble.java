/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal7;


class bubble {
// Fungsi untuk melakukan Bubble Sort
    public static void bubble(String[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++ ) {
            for (int j = 0; j < n-1; j++) {
                if (array[j].compareTo(array[j+1])>0) {
                    // Tukar elemen j dengan j+1
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
