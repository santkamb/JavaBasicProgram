package com.javaprogram.javabasicprogram.basicprogram;

public class ArmStrong {
    public static void main(String [] args)
    {
        //153 =1+125+27 = 153
        //1634= 1+1296+81+256

        int number = 153;
        int originalNumber = number;
        int sum =0;
        while(number!=0)
        {
            int rem = number%10;
            sum =sum+(rem*rem*rem);
            number=number/10;

        }
        if(sum==originalNumber)
        {
            System.out.println("Armstrong number");
        }else
        {
            System.out.println("Not Armstrong number");
        }
    }
}
