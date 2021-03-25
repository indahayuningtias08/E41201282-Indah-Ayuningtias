/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ConditionalStatement {
    public static void main(String[] args) {
        //membuat variabel dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        //mengambil input
        System.out.print("Inputkan nilai: ");
        nilai = scan.nextInt();
        
        //hitung gradenya
        if (nilai >= 90) {
            grade = "A";
        }else if (nilai >= 80) {
            grade = "B+";
        }else if (nilai >= 70) {
            grade = "B";
        }else if (nilai >= 60) {
            grade = "C+";
        }else if (nilai >= 50) {
            grade = "C";
        }else if (nilai >= 40) {
            grade = "D";
        }else {
            grade = "E";
        }
        
        //cetak hasilnya
        System.out.println("Grade: " + grade);
    }
    
}
