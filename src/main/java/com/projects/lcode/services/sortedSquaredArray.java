package com.projects.lcode.services;

public class sortedSquaredArray {

    public static void main(String[] args) {

        int[] array = new int[]{-3,-2,-1,4,5};
        var result = sortedSquaredArray(array);

        for(int i =0; i<result.length ;i++){
            System.out.println(result[i]);
        }

    }


    public static int[] sortedSquaredArray(int[] array) {

        int[] outputArray = new int[array.length];
        int minIndex= 0;
        int maxIndex= array.length-1;

        for(int i=array.length-1; i>=0 ;i--){

            if(minIndex==maxIndex){
                outputArray[i] = array[minIndex] * array[minIndex];
                break;
            }

            if(Math.abs(array[minIndex]) > Math.abs(array[maxIndex])) {
                outputArray[i]= array[minIndex] * array[minIndex];
                minIndex++;
            }
            else {
                outputArray[i] = array[maxIndex] * array[maxIndex];
                maxIndex--;
            }
        }
        return outputArray;
    }
}
