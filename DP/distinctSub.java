package com.company.DP;

import java.util.*;

public class distinctSub {
    private static int[][] dp;
    public static void main(String[] args) {
        dp = new int[8][7];
        for (int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        System.out.println(solve("rabbbit", "rabbit", 7, 6));

    }

    private static int solve(String s, String p, int i, int j) {
        if(i == 0 || j == 0) {
            if(j == 0) {
                return 1;
            }

            return 0;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        dp[i][j] = 0;
        if(s.charAt(i - 1) == p.charAt(j - 1)) {
            dp[i][j]  = solve(s, p, i - 1, j) + solve(s, p, i - 1, j - 1);
        } else {
            dp[i][j]  = solve(s, p, i - 1, j);
        }

        return dp[i][j];
    }
}
