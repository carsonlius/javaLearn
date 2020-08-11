package com.carsonlius.chapter03.array.demo;

import java.util.Arrays;
import java.util.Comparator;

public class Test04 {
    public static void main(String[] args) {
        sort2();
        sortArrays();
    }

    private static  void  sort2(){
        int[][] twoDim = { {1, 2}, {3, 7}, {8, 9}, {4, 2}, {5, 3} };

        Arrays.sort(twoDim, Comparator.comparingInt(a -> a[0]));

        System.out.println(Arrays.deepToString(twoDim));
    }

    private static void sortArrays(){
        Person [] [] persons = new Person[10][];
        Person[] person1 = new Person[10];
        person1[0] = new Person(13);
        person1[1] = new Person(14);
        person1[2] = new Person(9);

//        Arrays.sort(person1, Comparator.comparingInt(pe->pe.getAge()));
        Arrays.sort(person1, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1 == null || o2 == null) {
                    return 1;
                }
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(Arrays.deepToString(person1));
        int a =person1.length;

    }
}
