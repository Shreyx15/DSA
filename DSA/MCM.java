package com.company.DSA;
import java.util.*;

// Java code to implement the
// matrix chain multiplication using recursion

public class MCM {

    // Matrix Ai has dimension p[i-1] x p[i]
    // for i = 1 . . . n
    private static int min = Integer.MAX_VALUE;
    public static void main(String args[])
    {
        int arr[] = new int[] { 1, 2, 3, 4, 3 };
        int N = arr.length;
        int[][] dp = new int[4][4];
        // Function call
        System.out.println(
                "Minimum number of multiplications is "
                        + MatrixChainOrder(arr, 1, N - 1, dp));
    }

    static int MatrixChainOrder(int p[], int i, int j, int[][] dp)
    {
        if (i == j)
            return 0;

        dp[i][j] = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int count = MatrixChainOrder(p, i, k, dp)
                    + MatrixChainOrder(p, k + 1, j, dp)
                    + p[i - 1] * p[k] * p[j];

            if (count < dp[i][j])
                dp[i][j] = count;
        }

        // Return minimum count
        return dp[i][j];
    }

    // Driver code

}

