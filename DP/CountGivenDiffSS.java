package com.company.DP;

import java.util.Arrays;

public class CountGivenDiffSS {
    private static int[][] dp;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        dp = new int[arr.length + 1][sum + 1];
        for (int[] nums: dp) {
            Arrays.fill(nums, -1);
        }

        System.out.println(givenDiff(arr, arr.length, 0, sum, 1) / 2);


    }

    private static int givenDiff(int[] arr, int n, int sum, int total, int diff) {
        if(n == 0) {
            int a = sum;
            int b = total - sum;
            if(Math.abs(a - b) == diff) {
                return 1;
            }
            return 0;
        }

        if(dp[n][sum] != -1) {
            return dp[n][sum];
        }

        return dp[n][sum] = givenDiff(arr, n - 1, sum + arr[n - 1], total, diff) + givenDiff(arr, n - 1, sum, total, diff);
    }
}
