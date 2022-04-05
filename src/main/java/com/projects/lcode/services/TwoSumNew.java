package com.projects.lcode.services;

import java.util.HashMap;
import java.util.Map;

public class TwoSumNew {

    public static void main(String[] args) {
        var k = twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        for(int i = 0 ; i<k.length ;i++){
            System.out.println(k[i]);
        }
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {


        Map<Integer,Integer> inputMap = new HashMap<>();

        for(int i=0; i< array.length;i++){
            if(inputMap.get(targetSum - array[i])!=null){
                return new int[]{array[i],inputMap.get(targetSum - array[i])};
            }
            else{
                inputMap.put(array[i],array[i]);
            }

        }

        return new int[0];
    }


}
