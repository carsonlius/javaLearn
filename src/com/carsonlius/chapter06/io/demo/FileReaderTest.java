package com.carsonlius.chapter06.io.demo;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        String sourceFilePath = "./com/carsonlius/chapter06/io/resources/sourceFile.txt";
        System.out.println(sourceFilePath);
        System.out.println(FileReaderTest.class.getResource("sourceFile.txt").toString());

//        copy();
    }

    public static void copy(String sourceFileName) throws IOException {
        InputStream inputStream = new FileInputStream(sourceFileName);
        InputStreamReader fileReader = new InputStreamReader(inputStream, "GBK");

        int content = fileReader.read();

        while (content>= 0) {
            System.out.println(content);
            content = fileReader.read();
        }

    }
}
