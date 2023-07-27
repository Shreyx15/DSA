package com.company.recursion;

import java.util.ArrayList;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        boolean[][] visited = {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}
        };
        String word = "ABCB";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0) && search(board, visited, word, 0, i, j)) {
                    System.out.println("true");
                }
            }
        }


    }
    static boolean search(char[][] board, boolean[][] visited, String word, int wordIndex, int row, int col) {
        ArrayList<String> ans = new ArrayList<>();
        if((row == board.length || col == board[0].length )|| (row == -1 || col == -1)) {
            return false;
        }
        if(wordIndex == word.length() - 1) {
            return true;
        }
        if(board[row][col] != word.charAt(wordIndex)) {
            return false;
        }
        if(visited[row][col]) {
            return false;
        }
        visited[row][col] = true;
        if(search(board, visited, word, wordIndex + 1, row, col + 1)) {
            return true;
        }
        if(search(board, visited, word, wordIndex + 1, row, col - 1)) {
            return true;
        }
        if(search(board, visited, word, wordIndex + 1, row + 1, col)) {
            return true;
        }
        if(search(board, visited, word, wordIndex + 1, row - 1, col)) {
            return true;
        }

        visited[row][col] = false;

    return false;}


}
