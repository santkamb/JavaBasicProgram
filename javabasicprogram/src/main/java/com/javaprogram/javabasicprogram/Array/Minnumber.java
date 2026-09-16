package com.javaprogram.javabasicprogram.Array;

public class Minnumber {
    public static void main(String[] args) {

        int [] arr = {2,3,4,4,5,7,2,8,6,7,8,9,10};
        int min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
