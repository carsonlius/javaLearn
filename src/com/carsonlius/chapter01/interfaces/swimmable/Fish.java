package com.carsonlius.chapter01.interfaces.swimmable;

public class Fish implements  Swimmable{

    @Override
    public void swim() {
        System.out.println("🐟游泳");
    }
}