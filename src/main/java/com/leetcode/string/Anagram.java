package com.leetcode.string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {


    /**
     * var s and t change to char array
     * var with type char sorting
     * validate
     */
    public static boolean isAnagram(String s, String t){
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);
    }

    /**
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagramWihHashMap(String s, String t){
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            int mmk = map.getOrDefault(c, 0) + 1;
            char c1 = c;

            map.put(c1, mmk);
        }

        System.out.println(map);

        for (char c : t.toCharArray()) {
            int mmk = map.getOrDefault(c, 0) - 1;
            char c1 = c;

            map.put(c1, mmk);
        }

        System.out.println(map);

        for (int v : map.values()) {
            if (v != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagarad";


//        Map<Character, Integer> map = new HashMap<>();
//
//        char[] a = {'a','b'};
//
//        for (char d : a) {
//            System.out.println(map.getOrDefault(d, 0));
//        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            int mmk = map.getOrDefault(c, 0) + 1;
            char c1 = c;

            map.put(c1, mmk);
        }



        System.out.println(isAnagramWihHashMap(s, t));
    }
}
