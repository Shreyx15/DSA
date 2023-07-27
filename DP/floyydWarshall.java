package com.company.DP;

public class floyydWarshall {
    private static int V = 4;
    private static int INF = 99999;

    public static void main(String[] args) {
        int graph[][] = {
                { 0, 5, INF, 10 },
                { INF, 0, 3, INF },
                { INF, INF, 0, 1 },
                { INF, INF, INF, 0}
        };
        int[][] dist = solve(graph, new int[V][V]);
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if(dist[i][j] == INF) {
                    System.out.print("INF" + " ");
                } else {

                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    
    static int[][] solve(int[][] Graph, int[][] dist) {
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[0].length; j++) {
                dist[i][j] = Graph[i][j];
            }
        }
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {

                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        
        
        
    return dist;}
}
