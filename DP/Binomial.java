package com.company.DP;

import java.util.Arrays;

public class Binomial {
    public static void main(String[] args) {
        int[][] dp = new int[4 + 1][2 + 1];
        for (int[] arr :
                dp) {
            Arrays.fill(arr, -1);
        }

        System.out.println(compute(4, 2, dp));
    }

    static int compute(int i, int j, int[][] dp) {
        if(i == j || j == 0) {
            return 1;
        }
        if(dp[i][j] != -1) {
            return dp[i][j];
        }


        dp[i][j] = compute(i - 1, j - 1, dp) + compute(i - 1, j, dp);


    return dp[i][j];}
}
