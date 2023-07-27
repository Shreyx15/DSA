package com.company.DP;

import java.util.Arrays;

public class lcsprint {
    private static int[][] dp;
    public static void main(String[] args) {
        dp = new int[9][5];
        for (int[] arr :dp) {
            Arrays.fill(arr, -1);
        }
        String s1 = "leetcode";
        String s2 = "etco";

        for (int i = 0; i < 5; i++) {
            dp[i][0] = 0;
        }

        for (int i = 0; i < 4; i++) {
            dp[0][i] = 0;
        }
        for(int i = 1; i < 9; i++) {
            for(int j = 1; j < 5; j++) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else  {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(8 - dp[8][4]);

    }
}
