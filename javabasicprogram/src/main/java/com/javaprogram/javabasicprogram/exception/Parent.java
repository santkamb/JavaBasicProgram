package com.javaprogram.javabasicprogram.exception;

import java.io.IOException;

public class Parent {
    void print()
        {
        System.out.println("print");
        }
}

class Child extends Parent{
//override method does not declare checked Exception but It can declare Unchecked Exception
//
//    void print() throws IOException
//    {
//        System.out.println("print");
//    }

    //if it handle unchecked it works

    void print() throws RuntimeException
    {
        System.out.println("print");
    }
}
