package com.company.DP;

import java.util.Arrays;

public class lcs {
    private static int[][] dp;
    public static void main(String[] args) {
        dp = new int["forgeeksskeegfor".length() + 1]["forgeeksskeegfor".length() + 1];

        for (int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
//        System.out.println(dp[0][0]);
//        StringBuilder sb = new StringBuilder("forgeeksskeegfor");
//        String rev = sb.reverse().toString();

        System.out.println(LCS("GeeksforGeeks", "GeeksQuiz", 13, 9, 0));
    }

    static int LCS(String X, String Y, int i, int j, int count)
    {

        if (i == 0 || j == 0)
        {
            return count;
        }

        if (X.charAt(i - 1) == Y.charAt(j - 1))
        {
            count = LCS(X, Y, i - 1, j - 1, count + 1);
        }
        count = Math.max(count,
                Math.max(LCS(X, Y, i, j - 1, 0),
                        LCS(X, Y,i - 1, j, 0)));
        return count;
    }
}
