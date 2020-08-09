package com.carsonlius.chapter01.interfaces.swimmable;

public class SwimmingPool {
    public void accept(Swimmable swimmable){
        swimmable.swim();
        System.out.println(swimmable.now);
        Swimmable.sayHello();
    }
}
