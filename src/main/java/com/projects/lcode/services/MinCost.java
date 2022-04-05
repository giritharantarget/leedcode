package com.projects.lcode.services;

public class MinCost {


    public static void main(String[] args) {

        int[] cost = new int[] {10,15,20};

        MinCostClaimbingStairImpl minCost = new MinCostClaimbingStairImpl(cost);
        System.out.println(minCost.minCostClaimbingStairsTopDown(cost.length-1));
    }
}
