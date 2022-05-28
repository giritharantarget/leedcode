package com.projects.lcode.services;

import java.util.Arrays;

public class NonConstructibleChange {

    public static void main(String[] args) {

        int[] coins = new int[]{2};
        System.out.println(nonConstructibleChange(coins));
    }

    public static int nonConstructibleChange(int[] coins) {
        int change = 0;
        if(coins.length ==0 || (coins.length==1 && coins[0]==0))
            return 1;
       Arrays.sort(coins);
        // 1 1 1 9
       for (int i= 0; i< coins.length ; i++) {

           if(coins[i] <= change  || coins[i] == change+1) {
               change = change +coins[i];
           }
           else {
               return change = change +1;
           }

       }
        return change+1;
    }



}
