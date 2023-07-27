package com.company;

import java.util.Arrays;

public class countOfSubsetSum {
    private static int[][] dp;
    public static void main(String[] args) {
//        dp = new int[5][10];
//        for (int[] nums: dp) {
//            Arrays.fill(nums, -1);
//        }
//        System.out.println(count(new int[] {3, 5, 6, 7}, 9, 4));

        boolean[] arr = new boolean[10];
        System.out.println(arr[0]);
    }
//    private static int count(int[] arr, int target, int n) {
//        if(target == 0) {
//            return 1;
//        }
//
//        if(n == 0) {
//            return 0;
//        }
//
//        if(dp[n][target] != -1) {
//            return dp[n][target];
//        }
//
//        if(arr[n - 1] <= target) {
//            return dp[n][target] = count(arr, target - arr[n - 1], n - 1) + count(arr, target, n - 1);
//        } else {
//            return dp[n][target] = count(arr, target, n - 1);
//        }
//    }
}

