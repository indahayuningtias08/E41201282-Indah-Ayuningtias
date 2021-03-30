/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;
public class Banyak_data_nilai {
    public static void main(String[] args)
    {
        int[] a = {23,69,98,30};
        int max=a[0];
        int min=a[0];
        for (int  i = 0; i < a.length; i++) {
            if (a[i]>max){
                max = a[i];
            }else if(a[i]<min){
                min = a[i];
            }
        }
        
        Scanner masuk = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        System.out.print ("Masukkan Banyaknya Data Nilai= ");
        n = masuk.nextInt();
        jum=0;
        i=1;
        while (i<=n){
                System.out.print ("Masukkan Data Nilai ke-"+i+"= ");
                x=masuk.nextFloat ();
                jum += x;
                i++;
               
        }
        
        System.out.println("nilai minimum = "+min);
        System.out.println("nilai maksimum = "+max);
        rata = jum / n;
        System.out.println ("Nilai rata ratanya adalah= "+rata);
        
   }
}
    
    

