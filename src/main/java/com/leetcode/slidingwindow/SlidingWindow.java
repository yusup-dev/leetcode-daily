package com.leetcode.slidingwindow;

public class SlidingWindow {

    public static int maxSumSliding(int[] nums, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int right = k; right < nums.length; right++) {
            windowSum += nums[right];
            windowSum -= nums[right - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }


    public static void main(String[] args) {
        int[] nums = {2,3,5,1,6};
        int k = 3;

        System.out.println(maxSumSliding(nums, k));
    }
}
