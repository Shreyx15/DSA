package com.company.DSA;

import java.util.ArrayList;

public class Bi_connected {


    private static void printBridge(ArrayList<ArrayList<Integer>> adj, int N) {
        boolean[] visited = new boolean[N];
        int[] low = new int[N];
        int[] tin = new int[N];
        int timer = 1;

        for (int i = 0; i < N; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < N; i++) {
            if(!visited[i]) {
                if(!dfs(i, -1, visited, tin, low, adj, timer)) {
                    System.out.println("Given graph is not bi-connected as there exists some articulation point for which graph beccomes disconnected!");
                } else {
                    System.out.println("Given graph is bi-connected!");
                }
            }
        }

    }

    private static boolean dfs(int node, int parent, boolean[] visited, int[] tin, int[] low, ArrayList<ArrayList<Integer>> adj, int timer) {
        visited[node] = true;
        low[node] = tin[node] = timer;
//        System.out.println(timer);
        timer++;


        for (int it :
                adj.get(node)) {
            if(it == parent) {
                continue;
            }
            if(!visited[it]) {
                dfs(it, node, visited, tin, low, adj, timer);
                low[node] = Math.min(low[node], low[it]);

                if(low[it] > tin[node]) {
                    return false;
                }
            } else {
                low[node] = Math.min(low[node], tin[it]);
            }

        }
    return true;}

    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i<n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(1);
        adj.get(0).add(3);
        adj.get(3).add(4);

        printBridge(adj, n);
    }
}
