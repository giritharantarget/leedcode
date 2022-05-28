package com.projects.lcode.services;

import java.util.HashMap;
import java.util.Map;

public class Array2D {

    public static void main(String[] args) {


        int[][] arr = {{1,2,3,4},
                {4,5,6,7},{4,5,6,7}};


        for(int i =0 ; i< arr.length ; i ++) {

            for(int j =0 ; j < arr[i].length ; j++) {

                System.out.println("value of i" + arr[i] [j] );
            }
        }

        HashMap<String, Integer> hm
                = new HashMap<String, Integer>();

        // Adding mappings to HashMap
        // using put() method
        hm.put("GeeksforGeeks", 54);
        hm.put("A computer portal", 80);
        hm.put("For geeks", 82);


        for(Map.Entry map : hm.entrySet()){
            map.getKey();

        }

    }
}
