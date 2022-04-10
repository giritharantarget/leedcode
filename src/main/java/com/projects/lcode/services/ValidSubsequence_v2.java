package com.projects.lcode.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidSubsequence_v2 {


    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 10);

        System.out.println(isValidSubsequence(array,sequence));

    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int result =0;
        for(Integer arr: array) {
            if(result==sequence.size())
                break;
            if(sequence.get(result).equals(arr)){
                result ++;
            }
        }

        return result==sequence.size();
    }
}
