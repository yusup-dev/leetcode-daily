package com.leetcode.hashtable;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = k - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int target = 9;
        int[] nums = {1,3,4,5};

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
