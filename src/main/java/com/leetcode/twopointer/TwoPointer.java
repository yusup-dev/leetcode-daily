package com.leetcode.twopointer;

import java.util.Arrays;
import java.util.HashSet;

public class TwoPointer {

    /**
     *
     */

    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                set1.add(nums2[i]);
            }
        }


        int[] array = set1.stream().toArray();

    }



    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
