package com.company.DP;

public class mps {
    private static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        solve(0, 1, new int[]{0, 2});
        System.out.println(max);
    }

    static void solve(int i, int j, int[] arr) {
        if(i == j) {
            max = Math.max(arr[j], max);
            return;
        }
        int temp = arr[i];
        int tempans = Integer.MIN_VALUE;
        max = Math.max(temp, max);
        for (int k = i + 1; k <= j; k++) {
            if(arr[k] == 0) {
                break;
            }
            temp *= arr[k];
            max = Math.max(max, temp);
        }
        solve(i + 1, j, arr);
    }
}

