package com.carsonlius.chapter04.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class Test08 {
    public static void main(String[] args)  {
        config();

        config2();
    }

    private static void config2()
    {
        String path = "com/carsonlius/chapter05/resoruces/config";
        ResourceBundle bundle = ResourceBundle.getBundle(path);

        System.out.println(bundle.getString("username"));
        System.out.println(bundle.getString("password"));
    }

    private static void config()  {
        Properties properties = new Properties();


        try {
            String path = "/com/carsonlius/chapter05/resoruces/config.properties";
            String path1 = "com/carsonlius/chapter05/resoruces/config.properties";
            InputStream inputStream = Test08.class.getResourceAsStream(path);
            InputStream inputStream1 = Thread.currentThread().getContextClassLoader().getResourceAsStream(path1);
            properties.load(inputStream1);

            properties.setProperty("age", "28");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("age"));
        System.out.println(properties.getProperty("age2"));
    }
}
