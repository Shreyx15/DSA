package com.company.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class dijkstra implements Comparator<dijkstra> {
    int V;
    int weight;

    public dijkstra(int v, int weight) {
        V = v;
        this.weight = weight;
    }

    public dijkstra() {

    }

    public int getV() {
        return V;
    }

    public int getWeight() {
        return weight;
    }
    @Override
        public int compare(dijkstra node1, dijkstra node2) {
            if (node1.weight > node2.weight) {
                return 1;
            } else if (node1.weight < node2.weight) {
                return -1;
            } else return 0;
        }



    private static void shortestPath(int src, ArrayList<ArrayList<dijkstra>> adj, int N) {
        int[] dist = new int[N];
        for (int i = 0; i < N; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        PriorityQueue<dijkstra> pq = new PriorityQueue<dijkstra>(N, new dijkstra());
        pq.add(new dijkstra(src, 0));


        while(pq.size() > 0) {
            dijkstra node = pq.poll();
            for (dijkstra it :
                    adj.get(node.getV())) {
                if(dist[node.getV()] + it.getWeight() < dist[it.getV()]) {
                    dist[it.getV()] = node.getV() + it.getWeight();
                    pq.add(new dijkstra(it.getV(), dist[it.getV()]));
                }
            }
        }
        System.out.println(pq.isEmpty());

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<dijkstra>> adj = new ArrayList<ArrayList<dijkstra>>();
        int n = 6;
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<dijkstra>());
        }
        adj.get(0).add(new dijkstra(1, 5));
        adj.get(0).add(new dijkstra(2, 3));
        adj.get(1).add(new dijkstra(3, 2));
        adj.get(1).add(new dijkstra(4, 3));
        adj.get(2).add(new dijkstra(5, 3));
        adj.get(2).add(new dijkstra(1, 2));
        adj.get(3).add(new dijkstra(3, 3));




        shortestPath(1, adj, n);

    }
}
