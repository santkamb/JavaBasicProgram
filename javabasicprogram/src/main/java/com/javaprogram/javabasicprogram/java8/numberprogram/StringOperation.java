package com.javaprogram.javabasicprogram.java8.numberprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOperation {
    public static void main(String[]  args)
    {
        String str = "santoshbaliramkamble";
       // System.out.println(Arrays.toString(str.split("")));

        //find eachoccurance of string

        Map<String,Long> eachoccu= Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(eachoccu);
        //If your string contains spaces and special characters

        String stringoccu = "Santosh, Kamble!";

        //if Case-insensitive version like S and s be trated as samee
       // String str ="Santoshbaliramkamble".replaceAll("[^a-zA-Z]", "").toLowerCase();
        Map<String,Long> eachWithouts = Arrays.stream(stringoccu.replaceAll("[^a-zA-Z]", "")
                        .split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        eachWithouts.forEach((k, v) -> System.out.println(k + " = " + v));


        List<String> duplicate = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(s->s.getValue()>1).map(s->s.getKey()).collect(Collectors.toList());
        System.out.println(duplicate);

        //nonrepeated first character
        String nonrepeated = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(s->s.getValue()==1).map(s->s.getKey()).findFirst().get();
        System.out.println(nonrepeated);
    }
}
