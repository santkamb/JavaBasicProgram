package com.javaprogram.javabasicprogram.practice;

public class Palindromecheck {
    public static void main(String[] args) {
        int number =125;
        int reversenumber =0;
        int originalnumber=number;
        while(number!=0)
        {
            int digit = number%10;
            reversenumber =reversenumber*10+digit;
            number=number/10;
        }
        if(originalnumber==reversenumber)
        {
            System.out.println("Palindrome");
        }
    }
}
