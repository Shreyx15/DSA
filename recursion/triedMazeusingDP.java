package com.company.recursion;

public class triedMazeusingDP {
    public static void main(String[] args) {
        int[][] dp = new int[4][4];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(countways(3, 3, dp));


    }

    static int countways(int i, int j, int[][] dp) {
        int count = 0;
        if(i == 1 || j == 1) {
            return 1;
        }
        count = countways(i - 1, j, dp) + countways(i, j - 1, dp);
        if(dp[i][j] != -1) {
            return dp[i][j];
        } else {
            dp[i][j] = count;
        }


        return count;}

}
