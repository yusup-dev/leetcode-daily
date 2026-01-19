package com.leetcode.hashtable;

import java.util.*;

public class HashTable {

    public static void main(String[] args) {

//        String[] array = {"Khadijah", "Alya", "Najla", "Anisa", "Dea"};
//
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("name", 1);
//        hashMap.put("classes", 45);
//        hashMap.put("named", 65);
//
//        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("name");
//        hashSet.add("classes");
//        hashSet.add("chatgpt");
//
//        Hashtable<String, String> hashtable = new Hashtable<>();
//        hashtable.put("name", "yusup");
//        hashtable.put("class", "reguler c");
//        hashtable.put("majority", "teknik informatika");
//
//        System.out.println("This is hashMap : " + hashMap);
//        System.out.println("This is hashSet : " + hashSet);
//        System.out.println("This is array : " + Arrays.toString(array));
//        System.out.println("This is hashTable : " + hashtable);


        Map<Integer, String> key = new HashMap<>();
        key.put(null, "Name");

        System.out.println(key.containsValue("Name"));
    }
}
