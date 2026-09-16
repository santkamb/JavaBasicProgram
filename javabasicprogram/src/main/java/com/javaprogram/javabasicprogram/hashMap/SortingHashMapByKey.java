package com.javaprogram.javabasicprogram.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingHashMapByKey {
     public static void main(String [] args)
     {
         Map<Integer,String> map=new HashMap<>();
         map.put(1,"one");
         map.put(2,"two");
         map.put(3,"three");
         map.put(4,"four");
         map.put(5,"four");
         map.put(2,"five");
         System.out.println(map);

         TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>(map);

         for(Map.Entry<Integer,String>sm :treeMap.entrySet())
         {
             System.out.println(sm.getKey() +" "+sm.getValue());
         }

     }
}
