package com.carsonlius.chapter03.array.demo;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        Person [] persons = new Person[10];
        int begin = 0;
        String name = "carsonlius";
        while (begin < persons.length) {
            name = name + "-" + begin;
            persons[begin] = new Person(name);
            begin ++;
        }

        for (Person person : persons ) {
            System.out.println(person.getName());


        }
        
    }
}
