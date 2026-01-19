package com.leetcode.twopointer;

public class TwoSum {

    static boolean twoSumWithTwoPointer(int[] arr, int target) {

        int n = arr.length;

        for (int i = 0;i < n;i++) {

            for (int j = i + 1; j < n; j++) {

                if(arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {0, -1, 2, -3, 1};
        int target = 1;


        System.out.println(twoSumWithTwoPointer(arr, target));
    }
}
