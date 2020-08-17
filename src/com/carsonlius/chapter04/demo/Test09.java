package com.carsonlius.chapter04.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Test09 {
    public static void main(String[] args) {
        List<Map<String, String>> students = new ArrayList<>();

        Map<String, String> student = new HashMap<>();
        student.put("name", "carsonlius");
        student.put("address","beijing");

        students.add(student);

        student = new HashMap<>();
        student.put("name", "xiaxia");
        student.put("age", "28");
        students.add(student);

        System.out.println(students);

        Consumer<Map<String,String>> lam = Test09::testNow;
        students.forEach(Test09::testNow);

    }

    private static void testNow(Map<String, String> student){
        String name = student.get("name") + " - hello world";
        System.out.println(name);
    }
}
