/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;

public class tugas_e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu;
        String pembeli = scan.nextLine();
        
        System.out.println("        CAFE CERIA         ");
        System.out.println("       ANEKA MINUMAN       ");
        System.out.println("===========================");
        System.out.println("       SPECIAL MENU        ");
        System.out.println("      1.Soft drinks        ");
        System.out.println("      2.Mix juice          ");
        System.out.println("      3.Nescafe            ");
        System.out.println("      4.Soda milk          ");
        System.out.println("      5.Tea                ");
        System.out.println("===========================");
        System.out.println("Masukkan nama pembeli : " + pembeli);
        
        System.out.println("Silahkan masukkan pilihan anda :");
        menu = scan.nextLine();
        
        switch(menu) {
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case "2":
                System.out.println("Minuman yang anda pesan adalah Milk juice");
                break;
            case "3":    
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;    
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
    }
    System.out.println("Pesanan akan segera kami antar");
    System.out.println("Terima Kasih " + pembeli + "telah berkunjung diCafe Ceria");
    }
        
}
