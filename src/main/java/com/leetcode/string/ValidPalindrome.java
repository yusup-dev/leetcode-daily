package com.leetcode.string;

public class ValidPalindrome {

    static boolean isPalindrome(String s) {

        String letter = s.replaceAll("[^a-zA-Z0-9]","") .toLowerCase();
        int left = 0;
        int right = letter.length() - 1;
        int mid = (left + right) / 2;

        char[] arr = letter.toCharArray();

        for (; left < mid ; left++) {
            if (right < mid) {
                return true;
            }

            if(arr[left] != arr[right]) {
                return false;
            }
            right--;
        }

        return true;
    }

    static boolean isPalindromeWithLoopWhile(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
        System.out.println(isPalindromeWithLoopWhile(s));
    }
}
