package com.carsonlius.chapter04.demo;

public class Test03 {
    public static void main(String[] args) {
        String s1 = "hello123";
        String s2 = "hello" + 123;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        int num = 123;
        String s3 = "hello" + num;
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);
        Boolean bool = new Boolean("false");
        System.out.println(bool == false);

    }
}
