package com.carsonlius.chapter04.demo;

import java.util.LinkedList;

public class LinkListed {
    public static void main(String[] args) {
        LinkedList<Student> linkListed = new LinkedList<>();
        Student student = new Student();
        student.setName("liusen");

        linkListed.add(student);

        student = new Student();
        student.setName("xiaxia");
        linkListed.add(student);

        System.out.println(linkListed.toString());
    }
}
