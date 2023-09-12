package src.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdjacencyListGraph implements Graph {
    private final List<LinkedList<Integer>> adjacencyList;

    public AdjacencyListGraph(List<LinkedList<Integer>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public AdjacencyListGraph(Integer edges) {
        this.adjacencyList = new ArrayList<>();
        for (int index = 0; index < edges+1; index++) {
            adjacencyList.add(new LinkedList<>());
        }
    }

    @Override
    public void addEdge(Integer vertexA, Integer vertexB) {
        this.adjacencyList.get(vertexA).add(vertexB);
    }

    @Override
    public List<Integer> getNeighborhoods(Integer node) {
        return this.adjacencyList.get(node);
    }

    @Override
    public Integer countNeighborhoods(Integer node) {
        return this.adjacencyList.get(node).size();
    }

    @Override
    public boolean isNeighborhood(Integer vertexA, Integer vertexB) {
       return this.adjacencyList.get(vertexA).contains(vertexB);
    }
}
