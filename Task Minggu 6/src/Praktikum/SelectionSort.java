/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Asus
 */
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for(int i =0; i < arr.length -1; i++)
        {
            int index = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    
    public static void main (String a[]) {
        int[] arr1 = {7, 2, 12, 8, 3};
        System.out.println("Before Selection Sort");
        for(int i: arr1) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        selectionSort(arr1);
        
        System.out.println("After Selection Sort");
        for(int i: arr1) {
            System.out.print(i+" ");
        }
    }

}