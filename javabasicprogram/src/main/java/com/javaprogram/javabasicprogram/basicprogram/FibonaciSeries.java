package com.javaprogram.javabasicprogram.basicprogram;

public class FibonaciSeries {
    public static void main(String[] args) {
        int n=10;
        int m1=0,m2=1;
        int m3;
        System.out.println(m1);

        System.out.println(m2);
        for(int i=2;i<=n;i++){
            m3=m1+m2;
            System.out.println(m3);
            m1=m2;
            m2=m3;
        }
    }
}
