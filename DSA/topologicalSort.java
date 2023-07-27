package com.company.DSA;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;

public class topologicalSort {
    LinkedList<Integer>[] adj;
    private int V;

    public topologicalSort(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    private void Sort() {
        Stack<Integer> st = new Stack<Integer>();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < V; i++) {
            if(!visited[i]) {
                topoSort(i, st, visited);
            }
        }
        while(!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    private void topoSort(int v, Stack<Integer> st, boolean[] visited) {
        visited[v] = true;

        Iterator<Integer> itr = adj[v].listIterator();

        while(itr.hasNext()) {
            int n = itr.next();
            if(!visited[n]) {
                topoSort(n, st, visited);
            }
        }
        st.push(v);
    }


    private void addEdge(int u, int v) {
        adj[u].add(v);
    }

    public static void main(String[] args) {
        topologicalSort g = new topologicalSort(6);

        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is a Topological "
                + "sort of the given graph");

        g.Sort();
    }
}
