package com.getlogic.sorting;

public class Employee implements Comparable<Employee>{

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Employee o) {
        return  this.age > o.age ? 1 : -1;
    }
}
