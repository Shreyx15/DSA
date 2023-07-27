package com.company.DP;

import java.util.Arrays;

public class PathSum {
    private static int[][] dp;
    private static int[][] moves;
    public static void main(String[] args) {
        int[][] nums = {{4,4},{3,7}};
        moves = new int[][]{{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        dp = new int[nums.length][nums[0].length];
        for (int[] arr: dp) {
            Arrays.fill(arr, -1);
        }

        System.out.println(nums[nums.length - 1][nums[0].length - 1] + minPathSum2(nums, 0, 0));
    }

//    private static int minPathSum(int[][] nums, int i, int j) {
//        if(i == nums.length - 1 && j == nums[0].length - 1) {
//            return 0;
//        }
//
//        if((i < 0 || j < 0) || (i >= nums.length || j >= nums[0].length)) {
//            return Integer.MAX_VALUE - 100;
//        }
//
//        if(dp[i][j] != -1) {
//            return dp[i][j];
//        }
//
//        int temp = Math.min(nums[i][j] + minPathSum(nums, i + 1, j), nums[i][j] + minPathSum(nums, i, j + 1));
//        int temp2 = Math.min(nums[i][j] + minPathSum(nums, i - 1, j), nums[i][j] + minPathSum(nums, i, j - 1));
//        return dp[i][j] = Math.min(temp2, temp);
//    }

    private static int minPathSum2(int[][] nums, int i, int j) {
        if(i == nums.length - 1 && j == nums[0].length - 1) {
            return 0;
        }

        if((i < 0 || j < 0) || (i >= nums.length || j >= nums[0].length)) {
            return Integer.MAX_VALUE - 200;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int min = 0;

        for (int k = 0; k < moves.length; k++) {
            int row = moves[k][0];
            int col = moves[k][1];
            if((i + row < 0 || j + col< 0) || (i + row >= nums.length || j + col >= nums[0].length)) {
                continue;
            }
            min = Math.min(min, minPathSum2(nums, i + row, j + col));
        }

        return dp[i][j] = min;
    }
}
