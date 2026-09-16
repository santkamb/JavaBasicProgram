package com.javaprogram.javabasicprogram.Array;

public class DuplicateElement {
    public static void main(String [] args)
    {
         int [] arr = {2,3,4,4,5,7,2,8,6,7,8,9,10};

         for(int i=0;i<arr.length;i++)
         {
             boolean duplicate = false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]== arr[j])
                {
                    duplicate = true;
                    break;
                }
            }
            if(duplicate==true)
            {
                System.out.println(arr[i]);
            }
            }
         }
    }

