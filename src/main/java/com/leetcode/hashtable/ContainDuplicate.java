package com.leetcode.hashtable;

import java.util.HashSet;

public class ContainDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int value : nums) {

            if(set.contains(value)) {
                return true;
            }
            set.add(value);
        }


        return false;


    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,5};
        System.out.println(containsDuplicate(nums));
    }
}
