package src.graphs.algorithms;

import src.graphs.Graph;

import java.util.*;

public class BreadthFirstSearch {
    private final Graph graph;
    private final Integer root;

    public BreadthFirstSearch(Graph graph) {
        this.graph = graph;
        this.root = 0;
    }

    public BreadthFirstSearch(Graph graph, int root) {
        this.graph = graph;
        this.root = root;
    }

    // TODO: implementar o resultado em uma SearchTree, explicitando o pai e os filhos de cada vértice
    public List<Integer> search() {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Boolean> visitedVertexMap = new HashMap<>();
        LinkedList<Integer> queue = new LinkedList<>();
        visitedVertexMap.put(root, true);
        queue.add(root);
        while (!queue.isEmpty()) {
            Integer vertex = queue.poll();
            result.add(vertex);
            visitedVertexMap.put(vertex, true);
            for (Integer neighborhood : graph.getNeighborhoods(vertex)) {
                if(!visitedVertexMap.containsKey(neighborhood)) {
                    visitedVertexMap.put(neighborhood, true);
                    queue.add(neighborhood);
                }
            }
        }

        return result;
    }
}
