package com.company.DP;

import java.util.Arrays;

public class lpstring {
    private static int[][] dp;
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        dp = new int[s.length() + 1][s.length() + 1];

        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        System.out.println(lps(s, rev, s.length(), s.length(), "", 0));
    }

    private static int lps(String a, String b, int i, int j, String ans, int count) {
        if(i == 0 || j == 0) {
            if(isPalindrome(ans)) {
                return ans.length();
            }
            return 0;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        if(a.charAt(i - 1) == b.charAt(j - 1)) {
            return dp[i][j] = lps(a, b, i - 1, j - 1, ans + a.charAt(i - 1), count + 1);
        }


        dp[i][j] = Math.max(Math.max(lps(a, b, i - 1, j, "", 0), lps(a, b, i, j - 1, "", 0)), dp[i][j]);

        return dp[i][j];

    }

    private static boolean isPalindrome(String ans) {
        int i = 0;
        int j = ans.length() - 1
                ;
        while(i < j) {
            if(ans.charAt(i) != ans.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
