/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;
public class Menampilkan_bilangan_genap {
    public static void main(String[] args)
    {
        Scanner input=new
    Scanner(System.in);
        int awal,akhir;
        
        System.out.print("Masukkan batas awal :");
        awal=input.nextInt();
        System.out.print("Masukkan batas akhir :");
        akhir=input.nextInt();
        
        System.out.println("Deret Bilangan Genap");
        for (int i=awal; i<=akhir; i++) {
            if (i%2==0)
                System.out.print(i+" ");
        }
    }            
    
}
