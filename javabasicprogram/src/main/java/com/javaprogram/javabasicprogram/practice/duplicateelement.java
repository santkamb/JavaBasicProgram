package com.javaprogram.javabasicprogram.practice;

public class duplicateelement {
    public static void main(String[] args) {
        int [] arr = {2,4,3,5,5,7,8,9,9,10,11,15,16};
       // boolean isDuplicate = false;
        for(int i=0;i<arr.length;i++)
        {
            boolean isDuplicate=false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    isDuplicate=true;
                    break;
                }

            }
            if(isDuplicate)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
