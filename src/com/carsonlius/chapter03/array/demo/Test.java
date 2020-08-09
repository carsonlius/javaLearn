package com.carsonlius.chapter03.array.demo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        arrayCopy();
        copyOf();
    }

    private static void copyOf(){
        int [] data = {1,2,3,4,5};
        int [] newData =
                Arrays.copyOf(data, data.length *2);

        System.out.println(Arrays.toString(newData));

    }

    private static void arrayCopy(){
        int [] data = {1,2,3,4,5};
        int [] newData = new int[data.length*2];
        System.arraycopy(data, 0, newData, 0, data.length);
        newData[5] = 6;

        System.out.println(Arrays.toString(newData));
    }
}
