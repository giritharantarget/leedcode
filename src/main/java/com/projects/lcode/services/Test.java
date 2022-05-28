package com.projects.lcode.services;

public class Test {

    public static void main(String[] args) {

        String h = "Hello";
       Student s1 = new Student("Giri");
        System.out.println(s1.toString());
        subStr(s1);
        System.out.println(s1.toString());
    }

    static void subStr(Student s1) {
        Student s2 = s1;
        s2.setName("Steve");
        System.out.println(s2.toString());
    }
}
