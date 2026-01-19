package com.leetcode.array;

public class NestedLoop {


    public static void main(String[] args) {

        int[] nums = {1,2,4,5,6};


        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                System.out.println(i + " - " + j);
            }
        }
    }
}
