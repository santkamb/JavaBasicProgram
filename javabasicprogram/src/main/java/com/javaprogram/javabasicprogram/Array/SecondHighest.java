package com.javaprogram.javabasicprogram.Array;

public class SecondHighest {
    public static void main(String args[])
    {
        int [] arr = {2,3,4,4,5,7,2,8,6,7,8,9,10};
        int highest=0;
        int secondHighest=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>highest)
            {
                secondHighest=highest;
                highest=arr[i];
            }
            else if (arr[i]>secondHighest)
                {
                secondHighest=arr[i];
                }

        }
        System.out.println(secondHighest);
        System.out.println(highest);
    }
}
