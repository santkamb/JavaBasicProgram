package com.javaprogram.javabasicprogram.practice;

public class AarraySum {

    public static void main(String [] args)
    {
        int [] arr ={2,4,3,5,5,7,8,9,9,10,11,15,16};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum= sum+arr[i];
        }
        System.out.println("sum of array elemnet "+sum  );
    }
}
