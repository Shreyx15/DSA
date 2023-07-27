package com.company.SlidingWindow;

public class LSWSUMk {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = 0;
        int[] a = {-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        int N = a.length;
        int k = 15;
        while(j < N) {
            sum += a[j];

            if(sum == k) {
                max = Math.max(max, j - i + 1);
                sum -= a[i];
                i++;
            }
            if(sum > k) {
                sum = 0;
                i = j;
                i++;

            }
            j++;
        }

        System.out.println(max);
    }
}

