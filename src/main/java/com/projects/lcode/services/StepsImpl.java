package com.projects.lcode.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


public class StepsImpl {

    Map<Integer,Integer> memo = new HashMap<>();

    public  int steps(int i){

        if(i <= 2)
            return i;
        if(memo.get(i)==null) {
            memo.put(i,steps(i-1) + steps(i-2));
        }
        return memo.get(i);

    }
}
