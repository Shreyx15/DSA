package com.company.DP;

public class LPS {
    public static void main(String[] args) {
        String X = "abacdfgdcaba";
        String Y = new StringBuilder("abacdfgdcaba").reverse().toString();

        int m = X.length();
        int n = Y.length();
        int[][] LCSuff = new int[m + 1][n + 1];
        int len = 0;
        int row = 0, col = 0;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    LCSuff[i][j] = 0;

                else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    LCSuff[i][j] = LCSuff[i - 1][j - 1] + 1;
                    if (len < LCSuff[i][j]) {
                        len = LCSuff[i][j];
                        row = i;
                        col = j;
                    }
                }
                else
                    LCSuff[i][j] = 0;
            }
        }

        String resultStr = "";

        for (int i = 1; i < m; i++) {
            String temp = "";
            while (i > 0) {
                temp = X.charAt(i  - 1) + temp;
                i--;

                if(LCSuff[i][i] == 0) {
                    if(isPalindrome(temp) && temp.length() > resultStr.length()) {
                        resultStr = temp;
                        temp = "";
                    }
                }
            }

        }

        System.out.println(resultStr);


    }

    private static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

}
