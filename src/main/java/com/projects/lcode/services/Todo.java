package com.projects.lcode.services;

@FunctionalInterface
public interface Todo {

    void greetings();
    default String greetings1(){
        return "hello";
    };
}
