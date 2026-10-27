package com.javaprogram.javabasicprogram.practice;

public class nonduplicateelement {
    public static void main(String [] args)
    {
        int [] arr = {2,4,3,5,5,7,8,9,9,10,11,15,16};
        for(int i=0;i<arr.length;i++)
        {
            boolean isUnique  = true;
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j && arr[i]==arr[j])
                {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
