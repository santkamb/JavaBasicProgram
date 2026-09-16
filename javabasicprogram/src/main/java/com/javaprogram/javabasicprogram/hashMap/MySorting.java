package com.javaprogram.javabasicprogram.hashMap;

import java.util.Comparator;

public class MySorting implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        Integer d1 =(Integer) o1;
        Integer d2 =(Integer)o2;
        if(d1>d2){
            return -1;
        }else if(d1<d2){
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
