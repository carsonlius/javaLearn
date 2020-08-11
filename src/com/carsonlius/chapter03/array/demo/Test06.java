package com.carsonlius.chapter03.array.demo;

import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) {
        sum(1,2,3,4,5);
    }

    public static void sum(int ... data){
        int total = 0;
        for (int datum : data) {
            total += datum;
        }

        System.out.println("总值="+ total);
    }
}
