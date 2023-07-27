package com.company.DSA;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    private int V;
    private LinkedList<Integer>[] adj;

    public DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }


    private void addEdge(int src, int des) {
        adj[src].add(des);
    }

    private void Search() {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if(!visited[i]) {
                DFSUtil(i, visited);
            }
        }
    }

    private void DFSUtil(int i, boolean[] visited) {
        visited[i] = true;
        System.out.println(i + " ");

        Iterator<Integer> itr = adj[i].listIterator();
        while(itr.hasNext()) {
            int n = itr.next();
            if(!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal");

        // Function call
        g.Search();
    }
}
