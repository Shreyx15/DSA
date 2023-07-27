package com.company.DP;

import java.util.Arrays;

public class BTBS_II {
    private static int[][][] dp;
    public static void main(String[] args) {
        int[] p = {4, 1, 2};
        dp = new int[p.length][2][3];

        for(int[][] k:dp)
            for(int[] l:k)
                Arrays.fill(l,-1);


            System.out.println(maxProfit(p, -1, 0, p.length, 1, 2));
    }

    private static int maxProfit(int[] p, int holding, int day, int n, int canBuy, int c) {
        if(c == 0) {
            return 0;
        }

        if(day == n) {
            return 0;
        }

        if(dp[day][canBuy][c] != -1) {
            return dp[day][canBuy][c];
        }
        if(canBuy == 1) {
            int take = -p[day] + maxProfit(p, p[day], day + 1, n, 0, c);
            int notTake = maxProfit(p, -1, day + 1, n, 1, c);
            return dp[day][canBuy][c] = Math.max(take, notTake);
        } else {
                int take = p[day] + maxProfit(p, -1, day + 1, n, 1, c - 1);
                int notTake = maxProfit(p, holding, day + 1, n, 0, c);
                return dp[day][canBuy][c] = Math.max(take, notTake);


        }
    }
}
