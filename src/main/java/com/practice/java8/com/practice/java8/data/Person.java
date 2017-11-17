package com.practice.java8.com.practice.java8.data;

/**
 * Created by msivasub on 14/11/2017.
 */
public class Person {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    private final String name;

    public int getAge() {
        return age;
    }

    private final int age;


    public String toString() {
        return String.format("%s -%d",name,age);
    }

    public int ageDifference(Person person2) {
       return Integer.compare(this.age, person2.getAge());

    }
}
