package com.javaprogram.javabasicprogram.fibonaciseries;

import java.util.Scanner;

public class ArrayInputScanner {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter array size: ");
       int n = sc.nextInt();
       sc.nextLine(); // consume newline

       int [] arr = new int[n];

       System.out.println("Enter " + n + " integers:");

       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt(); // read each string
       }

       System.out.println("Array elements:");
       for (int str : arr) {
           System.out.println(str);
       }
   }
}
