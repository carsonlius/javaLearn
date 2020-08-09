package com.carsonlius.chapter01.interfaces.swimmable;

public class Dog implements Swimmable {
    @Override
    public void swim() {
        System.out.println("dog can swim");
    }
}
