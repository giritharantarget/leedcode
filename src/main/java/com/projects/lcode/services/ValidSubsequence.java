package com.projects.lcode.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidSubsequence {


    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 10);

        System.out.println(isValidSubsequence(array,sequence));

    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        Map<Integer,Integer> inputMap= new HashMap<>();
        int j = 0;
        for(Integer arra : array) {
            inputMap.put(arra,j++);
        }


        int matchedIndex= 0;
        for(Integer seq : sequence){

            if(inputMap.get(seq)!=null){
                if(matchedIndex< inputMap.get(seq)){
                    matchedIndex = inputMap.get(seq);
                }
                else
                    return false;
            }
            else
             return false;
        }

        return true;
    }
}
