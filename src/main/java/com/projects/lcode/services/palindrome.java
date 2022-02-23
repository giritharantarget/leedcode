package com.projects.lcode.services;

public class palindrome {

    public static void main(String[] args) {
        System.out.println(integerPalindrome(12321));
    }

    public static boolean integerPalindrome(int num){

        int revertedNumber = 0;
        while(num > revertedNumber) {
            revertedNumber = revertedNumber * 10 + num % 10;
            num /= 10;
            System.out.println("Reverted Number :: " + revertedNumber);
            System.out.println("remaining Num:: " + num);
        }

        // odd number of digits middle number always equal to itself
        return num==revertedNumber || num==(revertedNumber/10);

    }


}
