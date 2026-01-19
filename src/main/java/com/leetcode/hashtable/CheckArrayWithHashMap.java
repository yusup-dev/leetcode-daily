package com.leetcode.hashtable;

import java.util.HashMap;

public class CheckArrayWithHashMap {

    public static void main(String[] args) {

        int[] arr = {4,2,5,6,7,8,9,9};

        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int num : arr) {
            map.put(num, true);
        }

        int checkValue = 7;

        if(map.containsKey(checkValue)) {
            System.out.println(checkValue + " found in array");
        } else {
            System.out.println(checkValue + " not found");
        }
    }
}
