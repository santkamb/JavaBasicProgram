package com.javaprogram.javabasicprogram.Array;

public class MaxNumber {
    public static void main(String [] args)
    {
        int [] arr = {2,3,4,4,5,7,2,8,6,7,8,9,10};
        int max =arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        System.out.println(max);

    }
}
