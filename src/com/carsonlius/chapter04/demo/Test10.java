package com.carsonlius.chapter04.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("liusen");
        names.add("xiaxia");
        names.add("pengpeng");
        names.add("liusen");

        System.out.println(names.toString());

        names.remove(1);
        System.out.println(names.toString());
    }
}
