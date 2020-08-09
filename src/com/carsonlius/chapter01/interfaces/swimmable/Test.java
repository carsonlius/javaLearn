package com.carsonlius.chapter01.interfaces.swimmable;

public class Test {
    public static void main(String[] args) {
        SwimmingPool swimmingPool = new SwimmingPool();
        Swimmable swimmable = new Dog();
        swimmingPool.accept(swimmable);
        swimmable = new Fish();
        swimmingPool.accept(swimmable);
        swimmingPool.accept(new Swimmable() {
            @Override
            public void swim() {
                System.out.println("静态方法可以使用");
            }
        });

        swimmable.special();
    }
}
