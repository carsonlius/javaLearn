package com.carsonlius.chapter04.demo;

import java.util.*;

public class Test04 {
    public static void main(String[] args) {
        hashSetTest();
        treeSetTest();
    }

    private static void arrayLinked(){
        List<String> names = new LinkedList<>();

    }

    private static void treeSetTest()
    {
        Set<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        treeSet.add("bcd");
        treeSet.add("cde");
        treeSet.add("abc");
        treeSet.add("ebc");
        System.out.println(treeSet.toString());
    }

    private static void hashSetTest()
    {
        Set<String> set1 = new HashSet<>();

        set1.add("hello world");
        set1.add("hello world2");
        set1.add("hello world3");
        set1.add("hello world4");
        Boolean result=  set1.add("hello world4");
        System.out.println(result);

        System.out.println(set1.toString());
    }
}
