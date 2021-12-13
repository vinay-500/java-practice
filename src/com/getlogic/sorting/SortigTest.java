package com.getlogic.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortigTest {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(12,10,3,4,5,6);

        Collections.sort(ls);
        Collections.sort(ls, Collections.reverseOrder());

        ls.stream().forEach(System.out::println);
        ////////////////

        Employee e1 = new Employee("Vinay", 23);
        Employee e2 = new Employee("Rames", 24);
        Employee e3 = new Employee("Viy", 18);

        List<Employee> ls3 = Arrays.asList(e1,e2,e3);
        Collections.sort(ls3);
        ls3.forEach(s -> System.out.println(s.getAge()));
    }
}
