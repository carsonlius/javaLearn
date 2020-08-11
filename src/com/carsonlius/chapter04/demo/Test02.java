package com.carsonlius.chapter04.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String now = simpleDateFormat.format(date);
        System.out.println(now);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1= simpleDateFormat1.parse(now);
        System.out.println(date1);
    }
}