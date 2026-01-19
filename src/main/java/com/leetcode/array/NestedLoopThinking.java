package com.leetcode.array;

public class NestedLoopThinking {
    public static void main(String[] args) {
    
        int[] arr = {3, 7, 1, 9, 4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + " - " + arr[j]);
            }
        }
    }
}
