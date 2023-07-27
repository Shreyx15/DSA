package com.company.SlidingWindow;

public class firstNegative {
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        int[] ans = new int[arr.length - k + 1];

        int i = 0;
        int j = 0;



        for (int l = 0; l < ans.length; l++) {
            System.out.print(ans[l] + " ");
        }
    }
}
