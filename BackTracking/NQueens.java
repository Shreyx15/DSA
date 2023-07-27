package com.company.BackTracking;

public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = {
                {false, false, false, false, false, false, false, false},     //Create rowDes x colDes boolean matrix
                {false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false}
        };

        System.out.println(countWays(board, 0));
    }
    static int countWays(boolean[][] board, int row) {
        int count = 0;
        if(row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }


        for (int col = 0; col < board.length; col++) {
            if(isValid(board, row, col)) {
                board[row][col] = true;
                count += countWays(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if(board[i][col]) {
                return false;
            }
        }

        //for checking the left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i]) {
                return false;
            }
        }

        int maxRight = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i]) {
                return false;
            }
        }

    return true;}


    static void display(boolean[][] board) {
        for (boolean[] arr :
                board) {
            for (boolean element :
                    arr) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}

