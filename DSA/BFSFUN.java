package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFSFUN {
    private static final int V = 4;
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1);


        bfs(V, adj);
    }

    private static void bfs(int v, ArrayList<ArrayList<Integer>> adj) {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[v + 1];
        for (int i = 0; i < v; i++) {
            visited[i] = false;
        }


        for (int i = 0; i < v; i++) {
            if(!visited[i]) {
                visited[i] = true;
                queue.add(i);


                while(!queue.isEmpty()) {
                    int s = queue.poll();
                    System.out.println(s + " ");
                    for (Integer val :
                            adj.get(s)) {
                        if (!visited[val]) {
                            visited[val] = true;
                            queue.add(val);
                        }
                    }
                }


            }
        }



    }
}
