package com.leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicateByNear {

    // abs (i - j) <= k

    public static boolean containDuplicateByNearWithLoopingNotSlidingWindows(int[] nums, int k){

        for(int i = 0; i < nums.length;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j] && j - i <= k){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int lastIndex = map.get(nums[i]);
                if (i - lastIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
    
    public static boolean containsNearByDuplicateWithSet(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if(window.contains(nums[right])) {
                return true;
            }
            window.add(nums[right]);
            if(right - left >= k){
                window.remove(nums[left]);
                left++;
            }
        }
        return false;
    }

    public static boolean containsNearByDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        int left = 0;
        for(int right = 0;right < nums.length;right++){
            if(right > k) {
                return true;
            }

            if (!set.add(nums[right])){
                set.remove(nums[left]);
            }
        }

        return false;

        /**
         1. Buat HashSet → untuk menyimpan elemen di window
         2. Set left = 0   → ini adalah i
         3. Loop right dari 0 sampai akhir array → ini adalah j
         4. Jika nums[right] SUDAH ADA di HashSet
         → return true (duplicate valid ditemukan)
         5. Tambahkan nums[right] ke HashSet
         6. Jika (right - left) >= k
         → hapus nums[left] dari HashSet
         → left++
         7. Jika loop selesai → return false
         */
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        int k = 3;

        System.out.println(containsNearByDuplicateWithSet(nums, k));
    }
}
