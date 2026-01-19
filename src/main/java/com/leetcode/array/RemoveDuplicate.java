package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

    public static int removeDuplicateArray(int[] nums){
        int k = 1;
        int n = nums.length;
        for(int i = 1; i < n; i++) {
            if(nums[i] != nums[i - 1]){
                nums[k++] = nums[i]; // menambahkan element kedepan dengan
            }
        }
        return k;
    }

    public static void main(String[] args) {

        List<String> news = new ArrayList<>();

        news.add("Name");
        news.add("Crocodile");

        System.out.println(news);
        int[] nums = {34,23,23,34};

        System.out.println("Result is: " + removeDuplicateArray(nums));
    }
}