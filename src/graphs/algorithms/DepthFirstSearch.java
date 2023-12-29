package src.graphs.algorithms;

import src.graphs.Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DepthFirstSearch {
    private final Graph graph;
    private final int root;

    public record VerticesOrderList(Map<Integer, Integer> entry, Map<Integer, Integer> exit) {}

    public DepthFirstSearch(Graph graph) {
        this.graph = graph;
        this.root = 0;
    }

    public DepthFirstSearch(Graph graph, int root) {
        this.graph = graph;
        this.root = root;
    }

    public VerticesOrderList search() {
        int entryOrder = 0;
        int exitOrder = 0;

        Map<Integer, Integer> entryList = new HashMap<>();
        Map<Integer, Integer> exitList = new HashMap<>();
        Map<Integer, Boolean> visitedVertexMap = new HashMap<>();
        LinkedList<Integer> queue = new LinkedList<>();
        visitedVertexMap.put(root, true);
        queue.add(root);

        while(!queue.isEmpty()) {
            int vertex = queue.pop();
            if(!exitList.containsKey(vertex)) exitList.put(vertex, ++exitOrder);

            for(Integer neighborhood : graph.getNeighborhoods(vertex)) {
                if(!visitedVertexMap.containsKey(neighborhood)) {
                    visitedVertexMap.put(neighborhood, true);
                    queue.add(neighborhood);
                } else if (!entryList.containsKey(neighborhood)) {
                    entryList.put(neighborhood, ++entryOrder);
                }
            }
        }

        return new VerticesOrderList(entryList, exitList);
    }
}
