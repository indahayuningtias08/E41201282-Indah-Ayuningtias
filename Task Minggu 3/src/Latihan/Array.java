/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Asus
 */
public class Array {
    public static void main(String[] args) {
        int[] angka = {5,10,17,20,1};
        String[] teks = {"Saya","sedang","belajar","OOP","Java"};
        
        for(int i=0; i<angka.length; i++) {
            System.out.println(angka[i]);
        }
        for (String tek : teks) {
            System.out.print(tek);
            System.out.print(" ");
        }
    }
}
