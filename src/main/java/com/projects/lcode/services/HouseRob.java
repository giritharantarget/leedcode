package com.projects.lcode.services;

public class HouseRob {


    public static void main(String[] args) {

        int[] nums = new int[] {2,1,5};
        HouseRobImpl hrTDImpl = new HouseRobImpl(nums);
        System.out.println(hrTDImpl.houseRobTopDown(nums.length-1));

    }




}
