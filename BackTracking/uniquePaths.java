package com.company.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class uniquePaths {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1}
        };
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        for (boolean[] arr :
                visited) {
            Arrays.fill(arr, false);
        }
        System.out.println(countpaths(maze, visited, 0, 0, 1));

    }

    static int countpaths(int[][] graph, boolean[][] visited, int r, int c, int count) {
        if((r < 0 || c < 0) || (r >= graph.length || c >= graph[0].length)) {
            return 0;
        }

        if(graph[r][c] == -1 || visited[r][c]) {
            return 0 ;
        }

        if(graph[r][c] == 2) {
            if(count == 9) {
                return 1;
            }
            return 0;
        }

        visited[r][c] = true;
        int ans = countpaths(graph, visited, r + 1, c, count + 1) +
        countpaths(graph, visited, r - 1, c, count + 1) +
        countpaths(graph, visited, r, c + 1, count + 1) +
        countpaths(graph, visited, r, c - 1, count + 1);
        visited[r][c] = false;


    return ans;}
}
