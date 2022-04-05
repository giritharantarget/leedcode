package com.projects.lcode.services;

import java.util.HashMap;
import java.util.Map;

public class MinCostClaimbingStairImpl {

    private Map<Integer,Integer> minCostMemo = new HashMap<>();
    int[] cost;
    public MinCostClaimbingStairImpl (int[] cost){
        this.cost = cost;
    }

    public int minCostClaimbingStairsTopDown(int i){

        if(i==0) return cost[0];
        if(i==1) return Math.min(cost[0],cost[1]);

        if(minCostMemo.get(i)==null) {
            minCostMemo.put(i ,Math.min(minCostClaimbingStairsTopDown(i-1),
                    minCostClaimbingStairsTopDown(i-2) +cost[i]));
        }

        return minCostMemo.get(i);

    }
}
