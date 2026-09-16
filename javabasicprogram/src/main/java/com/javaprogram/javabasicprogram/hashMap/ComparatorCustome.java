package com.javaprogram.javabasicprogram.hashMap;

import java.util.TreeSet;

public class ComparatorCustome {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>(new MySorting());
        treeSet.add(152);
        treeSet.add(185);
        treeSet.add(254);
        treeSet.add(110);
        treeSet.add(132);
        treeSet.add(10);
        System.out.println(treeSet);
    }
}
