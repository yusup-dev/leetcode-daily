package com.leetcode.hashtable;

import java.util.HashMap;

public class HashMapFromArray {


    public static void main(String[] args) {

        String[] names = {"Khadijah", "Ipit", "Alya", "Najla", "Anisa", "Citra", "Dea", "Noni"};

        HashMap<String, Integer> map = new HashMap<>();

        int i = 1;

        for (String name : names) {
            if(map.containsKey(name)) {
                map.put(name,2);
            }else {
                map.put(name, i++);
            }
        }

        for(String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
