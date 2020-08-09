package com.carsonlius.chapter02.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

    public static void main(String[] args)  {
        try {
            IOException ioException = new IOException();
            read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }catch (Exception e){

        }
            finally {
            System.out.println("hello world");
        }

        divide(5, 1);
    }

    public static void divide(int x, int y){
        int result = x/y;
        System.out.println("x/y="  + result);
    }

    public static void read() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("hello.txt");
    }


}
