package com.carsonlius.chapter04.demo;

public class Test {
    public static void main(String[] args) {
        String string = new String();
        System.out.println(string == "");
        System.out.println(string == null);
        System.out.println(string);

        Integer a = 77;
        Integer b = 77;
        Integer c = 155;
        Integer d = 155;
        System.out.println(a == b);
        System.out.println(a == 77);
        System.out.println(c == d);
    } 
}
