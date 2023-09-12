package src.graphs.algorithms;

import src.graphs.Graph;

import java.util.*;

public class BreadthFirstSearch {
    private Graph graph;
    private Integer root = 1;

    public BreadthFirstSearch(Graph graph) {
        this.graph = graph;
    }

    public BreadthFirstSearch(Graph graph, int root) {
        this.graph = graph;
        this.root = root;
    }

    public void run() {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Boolean> visitedVertexMap = new HashMap<>();
        LinkedList<Integer> queue = new LinkedList<>();
        visitedVertexMap.put(root, true);
        queue.add(root);
        while (!queue.isEmpty()) {
            Integer vertex = queue.pop();
            result.add(vertex);
            visitedVertexMap.put(vertex, true);
            for (Integer neighborhood : graph.getNeighborhoods(vertex)) {
                if(!visitedVertexMap.containsKey(neighborhood)) {
                    visitedVertexMap.put(neighborhood, true);
                    queue.add(neighborhood);
                }
            }
        }
    }
}
