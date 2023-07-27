package com.company.BackTracking;

import java.util.Arrays;

public class RatInMaze {
    public static void main(String[] args) {
        int maze[][] = { 
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } 
        };
        int[][] sol = new int[4][4];
        for (int[] arr :
                sol) {
            Arrays.fill(arr, 0);
        }
        solve(maze, 0, 0, sol);
    }

    static void solve(int[][] maze, int r, int c, int[][] sol) {

        if(isSafe(r, c, maze)) {
            sol[r][c] = 1;
        } else {
            return;
        }
        if(r == 3 && c == 3) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(sol[i][j] + " ");
                }
                System.out.println();
            }
            return;
        }


        solve(maze, r, c + 1, sol);
        solve(maze, r + 1, c, sol);
        sol[r][c] = 0;

    }

    static boolean isSafe(int r, int c, int[][] maze) {
        if((r < 4 && c < 4) && maze[r][c] == 1)  {
            return true;
        }
    return false;}

}
