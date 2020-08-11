package com.carsonlius.chapter03.array.demo;

public class Person {

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int age;
    public String getName() {
        return name;
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }
}
