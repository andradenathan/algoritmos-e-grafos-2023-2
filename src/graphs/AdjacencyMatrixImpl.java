package src.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacencyMatrixImpl implements Graph {
    private final static Integer isConnected = 1;

    private final List<List<Integer>> adjacentMatrix;

    public AdjacencyMatrixImpl(List<List<Integer>> adjacentMatrix) {
        this.adjacentMatrix = adjacentMatrix;
    }

    public AdjacencyMatrixImpl(Integer edges) {
        adjacentMatrix = new ArrayList<>();
        for (int index = 0; index < edges; index++) {
            adjacentMatrix.add(new ArrayList<>(Collections.nCopies(edges, 0)));
        }
    }

    @Override
    public List<Integer> getNeighborhoods(Integer node) {
        List<Integer> neighborhoods = new ArrayList<>();
        for (int vertex = 0; vertex < adjacentMatrix.get(node).size(); vertex++) {
            Integer edge = adjacentMatrix.get(node).get(vertex);
            if (edge != isConnected) continue;
            neighborhoods.add(vertex);
        }
        return neighborhoods;
    }

    @Override
    public void addEdge(Integer vertexA, Integer vertexB) {
        this.adjacentMatrix.get(vertexA).set(vertexB, 1);
    }

    @Override
    public boolean isNeighborhood(Integer vertexA, Integer vertexB) {
        return adjacentMatrix.get(vertexA).get(vertexB) == isConnected;
    }
    @Override
    public Integer countNeighborhoods(Integer node) {
        return getNeighborhoods(node).size();
    }
}
