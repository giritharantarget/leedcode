package com.projects.lcode.services;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class Steps {



    private static StepsImpl stepsImpl = new StepsImpl();

    public static void main(String[] args) {

        System.out.println(stepsImpl.steps(100));
    }

}
