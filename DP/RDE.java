package com.company.DP;

import java.util.Arrays;

public class RDE {
    private static int[] dp;
    public static void main(String[] args) {
        int[][] env = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        dp = new int[env.length];
        Arrays.fill(dp, -1);
        System.out.println(solve(env, Integer.MAX_VALUE, Integer.MAX_VALUE, 0));
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
    }

    private static int solve(int[][] env, int w, int h, int idx) {
        int max = 0;
        for (int i = 0; i < env.length; i++) {
            int currw = env[i][0];
            int currh = env[i][1];
            int currsum = 0;
            if(w > currw && h > currh) {
                currsum = 1 + solve(env, currw, currh, i);
            }

            max = Math.max(max, currsum);


        }


        return dp[idx] = max;

    }
}
