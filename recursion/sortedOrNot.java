package com.company.recursion;

public class sortedOrNot {
    public static void main(String[] args) {
        int[] nums = {5, 4, 8};
        System.out.println(sorted(nums, nums.length));
    }

    static boolean sorted(int[] nums, int n) {
        if(n == 0 || n == 1) {
            return true;
        }

        if(nums[n - 1] < nums[n - 2]) {
            return false;
        }
        return sorted(nums, n - 1);
    }
}
