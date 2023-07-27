package com.company.DP;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        int[][] dp = new int[nums.length][2009];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(count(nums, 0, 0, target, dp));
    }

    private static int count(int[] nums, int i, int sum, int target, int[][] dp) {
        int count = 0;
        if(i == nums.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        if(dp[i][sum + 1001] != -1) {
            return dp[i][sum + 1001];
        }
        count = count(nums, i + 1, sum + nums[i], target, dp) + count(nums, i + 1, sum - nums[i], target, dp);
        dp[i][sum + 1001] = count;


        return dp[i][sum + 1001];}
}
