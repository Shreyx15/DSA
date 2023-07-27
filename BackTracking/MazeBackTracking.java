package com.company.BackTracking;

import java.util.Arrays;

public class MazeBackTracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},     //Create rowDes x colDes boolean matrix
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[3][3];

        backMaze("", 0, 0, board, path, 1);
    }

    private static void backMaze(String p, int r, int c, boolean[][] board, int[][] path, int step) {
        if(r == 2 && c == 2) {
            path[r][c] = step;
            for (int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p+"\n");
            return;
        }
        if(!board[r][c]) {
            return;
        }


        board[r][c] = false;
        path[r][c] = step;

        if(r < 2) {
            backMaze(p + 'D', r + 1, c, board, path,step + 1);
        }
        if(c < 2) {
            backMaze(p + 'R', r, c + 1, board, path,step + 1);
        }
        if(r > 0) {
            backMaze(p + 'U', r - 1, c, board, path,step + 1);
        }
        if(c > 0) {
            backMaze(p + 'L', r, c - 1, board, path,step + 1);
        }

        board[r][c] = true;
        path[r][c] = 0;



    }
}
