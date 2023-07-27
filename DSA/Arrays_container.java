package com.company;

public class Arrays_container {
    public static void main(String[] args) {
        int[] a = {1, 1};
        maxArea(a);
    }

    public static void maxArea(int[] height) {
        int maxarea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j > 0; j--) {
                if((height[i]-height[j])!=0) {
                    maxarea = Math.min(height[i], height[j]) * Math.abs(i - j);
                }

                else {
                    maxarea = Math.min(height[i], height[j]);
                }

            }

        }
        System.out.println(maxarea);
    }
}