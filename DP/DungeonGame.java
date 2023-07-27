package com.company.DP;

public class DungeonGame {
    public static void main(String[] args) {
        int[][] d = {
                {-2,-3,-3},
                {-5,-10,-1},
                {-10,-30,-5}
        };
        System.out.println(solve(d, 0, 0));
//        System.out.println(Math.min(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    private static int solve(int[][] d, int row, int col) {

        if(row == d.length - 1 && col == d[0].length - 1) {
            if(d[row][col] < 0) {
                return 1 + Math.abs(d[row][col]);
            } else {
                return 1;
            }
        }

        if(row >= d.length || col >= d[0].length) {
            return Integer.MAX_VALUE;
        }

        int down = solve(d, row + 1, col);
        int right = solve(d, row, col + 1);
        int ans = 0;
        if (d[row][col] < 0) {
             ans = Math.min(down, right) + Math.abs(d[row][col]);
        } else {
            int health = Math.min(down, right) - d[row][col];
            if (health <= 0) {
                health = 1;
            }
            ans = health;
        }
        return ans;
    }
}
