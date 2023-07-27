package com.company.DP;

public class uniquePaths {
    private static int i = 3;
    private static int j = 3;
    public static void main(String[] args) {
        System.out.println(countPaths(2, 2));
    }

    private static int countPaths(int row, int col) {
        if(row == 0 && col == 0) {
            return 1;
        }
        if(row == 1 && col == 1) {

            return 0;
        }
        if((row < 0 || col < 0) || (row >= i || col >= j)) {
            return 0;
        }


        return countPaths(row - 1, col) + countPaths(row, col - 1);


    }
}

