package com.javaprogram.javabasicprogram.exception;

public class A {

    void saySomething() throws ArithmeticException
    {
       int a=10;
       int b= 10/0;
        System.out.println(b);
    }
}

//
//class B extends A{
//    void saySomething() throws Exception
//    {}
//}
