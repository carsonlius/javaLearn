package com.carsonlius.chapter03.array.demo;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int [] [] ages = new int[3][];

        ages[0] = new int[] {1,2,3};
//        System.out.println(Arrays.toString(ages[0]));
//        ages[1]  = {3,4,5};

        int [] [] times = new int[][]{{1,2,3}, {4,5,6}};
        int a = times.length;
        times[0] = new int[]{12,13};
        for (int[] time : times) {
                System.out.println(Arrays.toString(time));
        }

        int count = times.length;
        System.out.println(count);
    }
}
