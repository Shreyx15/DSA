package com.company.BackTracking;

public class HamiltonianCycle {
    private static int V = 5;
    public static void main(String[] args) {
        int graph1[][] = {
                {0, 1, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 0, 0, 1},
                {1, 1, 0, 0, 1},
                {0, 1, 1, 1, 0},
        };
        int[] path = new int[V];
        path[0] = 0;
        if(CycleExists(graph1, path, 1)) {
            for (int i = 0; i < V; i++) {
                System.out.print(path[i] + " ");
            }
            System.out.print(0);
        }
    }

    static boolean CycleExists(int[][] graph, int[] path, int pos) {
        //base case takes place here
        if(pos == V) {
            if(graph[path[pos - 1]][path[0]] == 1) {
                return true;
            }
            return false;
        }

        for (int v = 0; v < V; v++) {
            if(isSafe(graph, path, pos, v)) {
                path[pos] = v;
                if(CycleExists(graph, path, pos + 1)) {
                    return true;
                }
                path[pos] = -1;
            }
        }
    return false;}
    static boolean isSafe(int[][] graph, int[] path, int pos, int v) {
        for (int i = 0; i < pos; i++) {
            if(path[i] == v) {
                return false;
            }
        }
        if(graph[path[pos - 1]][v] == 0) {
            return false;
        }


    return true;}
}
