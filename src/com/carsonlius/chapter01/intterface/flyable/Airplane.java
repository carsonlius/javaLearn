package com.carsonlius.chapter01.intterface.flyable;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("飞机 使用发动机在飞");
    }
}
