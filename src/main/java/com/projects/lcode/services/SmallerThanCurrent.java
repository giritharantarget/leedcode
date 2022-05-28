package com.projects.lcode.services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerThanCurrent {

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] newNum = nums.clone();
        Arrays.sort(newNum);
        int[] result = new int[nums.length];
        Map<Integer,Integer> hmap = new HashMap();
        System.out.println(Arrays.toString(newNum));
        System.out.println(Arrays.toString(nums));
        for(int i= 0; i< newNum.length ; i ++) {

            if(!hmap.containsKey(newNum[i])) {
                hmap.put(nums[i],i);
            }

        }
        System.out.println(hmap);
        for(int i= 0 ;  i< nums.length ; i ++) {
            result[i] = hmap.get(nums[i]);

        }
    }
}
