package com.company.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Comparator;

class NodeCost {

    int node; // Adjacent node
    int cost; // Costance/cost to adjacent node

    NodeCost (int node, int cost) {
        this.node = node;
        this.cost = cost;
    }
}

public class Prim {

    int Find_MST(int source_node, List<List<NodeCost>> graph) {

        Comparator<NodeCost> NodeCostComparator = (obj1, obj2) -> {
            return obj1.cost - obj2.cost;
        };

        PriorityQueue<NodeCost> pq = new PriorityQueue<>(NodeCostComparator);
        pq.add(new NodeCost(source_node, 0));

        boolean added[] = new boolean[graph.size()];
        Arrays.fill(added, false);

        int mst_cost = 0;

        while (!pq.isEmpty()) {
            NodeCost item = pq.peek();
            pq.remove();

            int node = item.node;
            int cost = item.cost;

            if ( !added[node] ) {
                mst_cost += cost;
                added[node] = true;
                for (NodeCost pair_node_cost : graph.get(node)) {
                    int adj_node = pair_node_cost.node;
                    if (!added[adj_node]) {
                        pq.add(pair_node_cost);
                    }
                }
            }
        }
        return mst_cost;
    }

    public static void main(String args[]) {

        Prim p = new Prim();

        int num_nodes = 6; // Nodes (0, 1, 2, 3, 4, 5)

        List<List<NodeCost>> graph_1 = new ArrayList<>(num_nodes);
        for (int i=0; i < num_nodes; i++) {
            graph_1.add(new ArrayList<>());
        }

        // Node 0
        Collections.addAll(graph_1.get(0), new NodeCost(1, 4), new NodeCost(2, 1), new NodeCost(3, 5));
        // Node 1
        Collections.addAll(graph_1.get(1), new NodeCost(0, 4), new NodeCost(3, 2), new NodeCost(4, 3),
                new NodeCost(5, 3));
        // Node 2
        Collections.addAll(graph_1.get(2), new NodeCost(0, 1), new NodeCost(3, 2), new NodeCost(4, 8));
        // Node 3
        Collections.addAll(graph_1.get(3), new NodeCost(0, 5), new NodeCost(1, 2), new NodeCost(2, 2),
                new NodeCost(4, 1));
        // Node 4
        Collections.addAll(graph_1.get(4), new NodeCost(1, 3), new NodeCost(2, 8), new NodeCost(3, 1),
                new NodeCost(5, 4));
        // Nod


        Collections.addAll(graph_1.get(5), new NodeCost(1, 3), new NodeCost(4, 4));

        // Start adding nodes to minimum spanning tree with 0 as the souce node
        System.out.println("Cost of the minimum spanning tree in graph 1 : " + p.Find_MST(0, graph_1));
    }
}
