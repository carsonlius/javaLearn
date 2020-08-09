package com.carsonlius.chapter01.interfaces.swimmable;

public interface Swimmable {
    // public static final
    String now = "2020-08-08";
    static void sayHello()
    {
        System.out.println("hello world");
    }

    // default可以带方法体
    default void special(){
        System.out.println("接口default修饰可以带方法体 ");
    }

    // public abstract
    void swim();
}
