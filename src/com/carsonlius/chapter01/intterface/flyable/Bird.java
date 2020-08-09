package com.carsonlius.chapter01.intterface.flyable;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("鸟 翅膀飞");
    }
}
