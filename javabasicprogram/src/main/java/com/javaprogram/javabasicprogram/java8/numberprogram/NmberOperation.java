package com.javaprogram.javabasicprogram.java8.numberprogram;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NmberOperation {
    public static void main(String [] args)
    {
        List<Integer> list=List.of(12,15,9,7,5,4,21,17,2,8,1,2,3,4,5,6,7,8,9,10);

        //find the even number from given list

        List<Integer> evennumber = list.stream().filter(s->s%2==0).collect(Collectors.toList());
        //list.stream().filter(s->s%2==1).forEach(System.out::println);
        System.out.println("even number"+evennumber);

        //find the  duplicate element from the given list
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicate = list.stream().filter(s->!set.add(s)).toList();
        System.out.println("dubplicate element "+duplicate);
        Set<Integer> set1 = new HashSet<>();
        List<Integer> distinct = list.stream().filter(s->set1.add(s)).toList();
        System.out.println("non-duplicate elements "+distinct);

        long count  = list.stream().count();
        System.out.println("Total count"+count);

        long max = list.stream().max(Integer::compareTo).get();
        System.out.println("Max number is"+max);

        long min = list.stream().min(Integer::compareTo).get();
        System.out.println("Min number is :"+min);

        List<Integer> sorted =list.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(sorted);

        //Reversed sorting
        List<Integer> rever=list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Reversed sorted elements: " + rever);
        //find second highest number
        int i = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second Highest number is: "+i);

        //print the number start with 1

        List<String> startwith1 = list.stream().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
        System.out.println("Number start with 1: "+startwith1);

        Integer sum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum is: "+sum);






    }

}
