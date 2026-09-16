package com.javaprogram.javabasicprogram.hashMap;

import java.util.*;

public class SortedHashMapValue {
    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"four");
        map.put(2,"five");

        List<Map.Entry<Integer,String>> list= new ArrayList<>(map.entrySet());
        Collections.sort(list,(e1, e2)->e1.getValue().compareTo(e2.getValue()));
        for(Map.Entry<Integer,String> entry:list){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
