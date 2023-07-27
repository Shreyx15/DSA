package com.company;

import java.util.Arrays;

public class search2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,3},
                {3,4,5},
                {33,2}

        };

        System.out.println(Arrays.toString(search(arr, 33)));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(target == arr[row][col]) {
                    return new int[]{row,col};
                }
            }
        }

    return new int[]{-1,-1};}
}
