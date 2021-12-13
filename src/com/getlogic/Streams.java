package com.getlogic;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String as[]){
        List<String> ls = new ArrayList<>();

        List<String> ls1 = Arrays.asList("able","push", "ram", "prasad", "viany");


        ls1.forEach(s -> System.out.println(s));


        ListIterator<String> li = ls1.listIterator();

        while(li.hasNext()){
            System.out.println(li.next());
        }

//        while(li.hasPrevious()){
//            System.out.println(li.next());
//        }
//
        System.out.println((ls1.stream().allMatch(s -> s.contains("a"))));
        System.out.println((ls1.stream().anyMatch(s -> s.contains("a"))));
        ls1.stream().filter(s -> s.contains("a")).forEach(System.out::println);
        List<String> a = ls1.stream().map(s -> s + "AAA").collect(Collectors.toList());
        a.forEach(s -> System.out.println(s));


        Map<String, String> newMap = new HashMap<>();
        newMap.put("name", "Vinay");
        newMap.put("age", "23");
        newMap.forEach((k,v) -> System.out.println(k + ""+ v));
        for (Map.Entry<String, String> entyr: newMap.entrySet()){
            System.out.println(entyr.getKey() + " " + entyr.getValue());
        }
    }
}
