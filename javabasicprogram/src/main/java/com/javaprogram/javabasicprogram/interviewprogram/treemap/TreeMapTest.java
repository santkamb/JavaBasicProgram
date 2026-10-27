package com.javaprogram.javabasicprogram.interviewprogram.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String [] args)
    {
        TreeMap<CgInteger,Integer> treeMap = new  TreeMap<>(Comparator.comparing(CgInteger::getId));

        CgInteger c1= new CgInteger(1);
        CgInteger c2= new CgInteger(2);
        CgInteger c3= new CgInteger(12);
        CgInteger c4= new CgInteger(4);
        CgInteger c5= new CgInteger(5);
        treeMap.put(c1,7);
        treeMap.put(c2,2);
        treeMap.put(c3,12);
        treeMap.put(c4,12);
        treeMap.put(c5,4);

        System.out.println("TreeMap Elements are : " + treeMap);

    }
}
