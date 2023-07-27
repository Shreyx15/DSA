package com.company.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class kruskal implements Comparator<kruskal> {
    int u;
    int v;
    int weight;

    public kruskal(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    public int getU() {
        return u;
    }

    public int getV() {
        return v;
    }

    public int getW() {
        return weight;
    }

    public kruskal() {
    }


    @Override
    public int compare(kruskal o1, kruskal o2) {
        return o1.weight - o2.weight;
    }

    static int findPar(int u, int[] parent) {
        if (parent[u] == u) {
            return u;
        }
        return parent[u] = findPar(parent[u], parent);
    }

    static void union(int u, int v, int[] parent, int[] rank) {
        u = findPar(u, parent);
        v = findPar(v, parent);
        if (rank[u] < rank[v]) {
            parent[u] = v;
            rank[v]++;
        } else if (rank[v] < rank[u]) {
            parent[v] = u;
            rank[u]++;
        } else {
            parent[v] = u;
            rank[u]++;
        }

    }

    static void kruskalAlgo(ArrayList<kruskal> adj, int N) {
        int[] parent = new int[N];
        int[] rank = new int[N];

        for (int i = 0; i < N; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        int cost = 0;
        ArrayList<kruskal> mst = new ArrayList<kruskal>();
        for (kruskal node : adj) {
            if (findPar(node.getU(), parent) != findPar(node.getV(), parent)) {
                cost += node.getW();
                mst.add(node);
                union(node.getU(), node.getV(), parent, rank);
            }
        }

        System.out.println("The cost of the constructed MST is \n" + cost);
        System.out.println("Following are the edges in the constructed MST");
        for (kruskal node :
                mst) {
            System.out.println(node.getU() + " - " + node.getV());
        }
    }

    public static void main(String[] args) {

        ArrayList<kruskal> adj = new ArrayList<kruskal>();
        adj.add(new kruskal(0, 1, 10));
        adj.add(new kruskal(0, 2, 6));
        adj.add(new kruskal(0, 3, 5));
        adj.add(new kruskal(1, 3, 15));
        adj.add(new kruskal(2, 3, 4));


        Collections.sort(adj, new kruskal());
//        for (kruskal obj :
//                adj) {
//            System.out.println(obj.getW());
//        }
        kruskalAlgo(adj, 5);
    }
}
