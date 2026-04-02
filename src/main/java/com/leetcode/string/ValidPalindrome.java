package com.leetcode.string;

public class ValidPalindrome {

    static boolean isPalindrome(String s) {

        int left = 0;
        String letter = s.replaceAll("[^a-zA-Z0-9]","") .toLowerCase();
        int right = letter.length() - 1;
        int mid = (left + right) / 2;

        char[] arr = letter.toCharArray();

        for (int j = right; j > mid ; j--) {
            if (left > mid) {
                return true;
            }

            if(arr[left] != arr[j]) {
                return false;
            }
            left++;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}
