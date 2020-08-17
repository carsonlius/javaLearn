package com.carsonlius.chapter04.demo;

import com.sun.corba.se.impl.presentation.rmi.StubFactoryStaticImpl;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student();
        student1.setAge(28);
        student1.setName("carsonlius");

        students.add(student1);

        Student student = new Student();
        student.setName("xiaxia");
        student.setAge(29);
        students.add(student);

        Student student2 = new Student();
        student2.setName("carsonlius");
        System.out.println(students.contains(student2));
        System.out.println(student2 == student1);
        System.out.println(student == student1);
        System.out.println(student.equals(student1));


    }
}
