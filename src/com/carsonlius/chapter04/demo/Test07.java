package com.carsonlius.chapter04.demo;

import java.util.Properties;

public class Test07 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("sync_xun", "1");

        properties.setProperty("sync_pos", "1");

        System.out.println(properties);
        System.out.println(properties.getProperty("sync_pos"));
        System.out.println(properties.getProperty("sync_wpb", "hello world"));
    }
}
