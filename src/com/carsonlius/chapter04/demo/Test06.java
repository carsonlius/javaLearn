package com.carsonlius.chapter04.demo;

import javax.swing.*;
import java.util.HashMap;
import java.util.Hashtable;

public class Test06 {
    public static void main(String[] args) {
        testHashTable();
    }

    private static void testHashTable()
    {
        HashMap<String, Integer> users = new HashMap<>(33);
        users.put("carsonlius", 28);
        users.put(null, null);

        Hashtable<String, Integer> teachers = new Hashtable<>();
        teachers.put("carsonlius", 28);
        teachers.put("1", 33);


        System.out.println(users.toString());
        System.out.println(teachers.toString());


    }
}
