package com.projects.lcode.services;

import java.util.List;

public class DiagonalTraverse {

    public static void main(String[] args) {

        List<List<Integer>> list = List.of(List.of(1,2), List.of(4,5,6), List.of(7,8,9));

        traverse(list);

    }


    public static void traverse(List<List<Integer>> input) {

        /**
         *    1  2
         *    4  5  6
         *    7  8  9
         *
         */

        Integer [] [] inputArray = input.stream()
                                        .map(l -> l.stream().toArray(Integer[]::new))
                                        .toArray(Integer[][]::new);

        int row = input.size();
        int column = input.size()-1;
        int i =0, j = 0 ;

        for(int k=0 ; k <= row -1 ; k++) {
            i=k ;
            j=0;
            while (i>=0) {

                System.out.println(inputArray[i][j]);
                i = i - 1;
                j = j + 1;
            }
        }


        for(int k = 1; k <=column; k++) {

            i= row-1;
            j= k;

            while(j<= column) {
                System.out.println(inputArray[i][j]);
                i = i - 1;
                j = j + 1;
            }
        }


    }
}
