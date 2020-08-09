package com.carsonlius.chapter02.demo;

public class Test02 {
    public static void main(String[] args) {
        ErrorParamsException errorParamsException = new ErrorParamsException("请输入shop_id");

        try {
            throw errorParamsException;
        } catch (ErrorParamsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage() + " at line " + e.getCause());
        }
    }
}
