package com.leetcode.twopointer;

public class TwoSum1 {

    static boolean twoSum(int[] arr, int target){
        int left = 0, right = arr.length;

        while(left < right) {
            int sum = arr[left] + arr[right];

            if(sum == target) {
                return true;
            }else if(sum < target) {
                left++;
            }else {
                right++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 19, 5};
        int target = 9;

        System.out.println(twoSum(arr, target));
    }
}
