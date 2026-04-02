package com.leetcode.string;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
    
        Arrays.sort(charArray);
        Arrays.sort(charArray1);

        return Arrays.equals(charArray, charArray1);
    }

    public static void main(String[] args) {    
        String s = "nagaram";
        String t = "anagrax";

        System.out.println(isAnagram(s, t));
    }
}
