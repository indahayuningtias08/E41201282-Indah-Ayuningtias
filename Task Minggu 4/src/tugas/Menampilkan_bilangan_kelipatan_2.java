/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Asus
 */
public class Menampilkan_bilangan_kelipatan_2 {
    public static void main(String[] args){
        System.out.println("          Do_While          ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        int nilai=1;
        int i;
        do {
            System.out.print(" " + nilai);
            nilai = nilai * 2;   
            
        }
        while(nilai<=100);
        
    }
    
}
