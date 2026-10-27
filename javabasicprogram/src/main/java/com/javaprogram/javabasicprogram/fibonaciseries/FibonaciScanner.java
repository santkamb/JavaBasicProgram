package com.javaprogram.javabasicprogram.fibonaciseries;

import java.util.Scanner;

public class FibonaciScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter start index");
        int startindex= sc.nextInt();

        System.out.println("Enter last index");
        int lastindex = sc.nextInt();

        int a=0,b=1;

        for(int i=0;i<=lastindex;i++)
        {
            if(i>=startindex)
            {
                System.out.println(a);
            }
            int next = a+b;
            a=b;
            b=next;
        }
        sc.close();



    }
}

