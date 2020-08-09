package com.carsonlius.chapter01.intterface.flyable;

public class Test {
    public static void main(String[] args) {
        Flyable flyable = new Bird();
        flyable.fly();

        flyable = new Airplane();
        flyable.fly();

        flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("匿名接口 飞翔中--");
            }
        };

        flyable.fly();
    }
}
