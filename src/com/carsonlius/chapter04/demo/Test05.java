package com.carsonlius.chapter04.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test05 {
    public static void main(String[] args) {
        Map ages = new HashMap<String, Integer>();
        Object result =  ages.put("carsonlius", 28);
        Object result2 = ages.put("xiaxia", 29);
        Object result3 = ages.put("xiaxia", 30);
        System.out.println(ages);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        Set set1 = new HashSet();
        set1.add(ages);
        System.out.println(set1);
    }
}