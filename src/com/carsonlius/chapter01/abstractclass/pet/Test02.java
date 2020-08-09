package com.carsonlius.chapter01.abstractclass.pet;

import com.carsonlius.chapter01.intterface.flyable.Airplane;
import com.carsonlius.chapter01.intterface.flyable.Bird;
import com.carsonlius.chapter01.intterface.flyable.Flyable;

public class Test02 {
    public static void main(String[] args) {
        Slingshot slingshot = new Slingshot();
        Flyable flyable = new Bird();
        slingshot.shot(flyable);
        flyable = new Airplane();
        slingshot.shot(flyable);
        slingshot.shot(new Flyable() {
            @Override
            public void fly() {
                System.out.println("子弹飞起来");
            }
        });
    }
}
