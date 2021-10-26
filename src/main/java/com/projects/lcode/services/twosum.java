package com.projects.lcode.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {
    public static void main(String[] args) {

        int[] nums =new int[] {7,12,2,17};
        int target = 29;
        var resultIndex = onepass(nums , target);

        for(int i=0; i<resultIndex.length;i++){
            System.out.println("result :: "+ resultIndex[i]);
        }
    }


    public static int[] twopass(int[] nums , int target){

        Map<Integer,Integer> numMap = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0 ; i<nums.length;i++)
        {
            numMap.put(nums[i],i);
        }

        //

        for(int i= 0; i< nums.length;i++){
            int complement = target - nums[i];
            if(numMap!=null && numMap.get(complement)!=null)
            {
                result[0] = i;
                result[1] = numMap.get(complement);
                return result;
            }

        }

        return result;
        //numMap.forEach((k,v) -> System.out.println(k + ":" +v));
    }


    public static int[] onepass(int[] nums , int target){
        Map<Integer,Integer> numMap = new HashMap<>();
        int[] result = new int[2];
        numMap.put(nums[0],0);
        for (int i=1; i< nums.length; i++){

            numMap.put(nums[i],i);
            int complement = target - nums[i];
            if(numMap!=null && numMap.get(complement)!=null)
            {
                result[0] = numMap.get(complement);
                result[1] = i;
                return result;
            }

        }

        return result;

    }
}
