package com.projects.lcode.services;

import java.util.HashMap;
import java.util.Map;

public class HouseRobImpl {

    private Map<Integer,Integer> amountMemo = new HashMap<>();
    private int[] nums;
    HouseRobImpl(int[] nums){
        this.nums=nums;
    }
    public  int houseRobTopDown(int i){

        // Base cases
        if (i == 0) return nums[0];
        if (i == 1) return Math.max(nums[0], nums[1]);
        if (!amountMemo.containsKey(i)) {
            amountMemo.put(i, Math.max(houseRobTopDown(i - 1), houseRobTopDown(i - 2) + nums[i])); // Recurrence relation
        }
        return amountMemo.get(i);


    }


}
