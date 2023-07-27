package com.company.BackTracking;

public class QueensMore {
    public static void main(String[] args) {
        boolean[][] board = {
                {false, false, false, false},     //Create rowDes x colDes boolean matrix
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}

        };
        System.out.println(counta(board, 0, 0, 4));
    }

    private static int counta(boolean[][] board, int row, int col, int queens) {
        int count = 0;
//        if(col == board.length) {
//            return 0;
//        }
        if(queens == 0 ) {
            display(board);
            System.out.println();
            return 1;
        }


        while(col < board.length) {
            if(isValid(board, row, col)) {
                board[row][col] = true;
                count += counta(board,row + 1, col, queens - 1);
                board[row][col] = false;
            } else {
                count += counta(board, row, col + 1, queens);
            }
        }


        return count;}

    static boolean isValid(boolean[][] board, int row, int col) {
        for (int i = row; i >0; i--) {
            if(board[row - i][col]) {
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

    private static void display(boolean[][] board) {
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
