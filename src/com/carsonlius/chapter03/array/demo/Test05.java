package com.carsonlius.chapter03.array.demo;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        genArray();
    }

    private static void genArray()
    {
        System.out.println("请输入姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name);
    }
}
