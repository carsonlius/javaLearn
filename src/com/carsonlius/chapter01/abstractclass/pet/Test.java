package com.carsonlius.chapter01.abstractclass.pet;

public class Test{
    public static void main(String[] args) {
        Pet cat;
        Master master = new Master();
        cat = new Cat();
        master.feed(cat);

        master.feed(new Pet() {
            @Override
            public void sellMeng() {
                System.out.println("狗 汪汪");
            }
        });
    }
}
