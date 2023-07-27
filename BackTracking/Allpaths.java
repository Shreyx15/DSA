package com.company.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Allpaths {
    public static void main(String[] args) {
        int n = 4;
//        int[][] graph = {{2}, {3}, {1}, {}};
//        boolean[][] Graph = new boolean[4][4];
//        for (boolean[] arr:
//             Graph) {
//            Arrays.fill(arr, false);
//        }
//        for(int i = 0; i < n -1; i++) {
//            for(int j = 0; j < graph[i].length; j++) {
//                Graph[i][graph[i][j]] = true;
//            }
//        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(Graph[i][j] + " ");
//            }
//            System.out.println();
//        }


        boolean[][] Graph = {
                {false, false, true, false},
                {false, false, false, true},
                {true, false, false, false},
                {false, false, false, false}

        };
        System.out.println(path(Graph, 0, new ArrayList<>()));

    }

    static List<List<Integer>> path(boolean[][] graph, int i, ArrayList<Integer> list) {
        List<List<Integer>> ans = new ArrayList<>();

        if(i == graph.length - 1) {
            list.add(i);
            ans.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return ans;
        }

        for (int j = i; j < graph.length; j++) {
            if(graph[i][j]) {
                list.add(i);
                ans.addAll(path(graph, j, list));
                list.remove(list.size() - 1);
            }

        }



    return ans;}
}
