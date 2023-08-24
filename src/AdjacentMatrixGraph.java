package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AdjacentMatrixGraph implements Graph {
    private final static Integer isConnected = 1;

    private final List<List<Integer>> adjacentMatrix;

    public AdjacentMatrixGraph(List<List<Integer>> adjacentMatrix) {
        this.adjacentMatrix = adjacentMatrix;
    }

    public AdjacentMatrixGraph(Integer edges) {
        adjacentMatrix = new ArrayList<>(edges+1);
        for(int index = 0; index < edges+1; index++) {
            adjacentMatrix.add(Arrays.asList(new Integer[edges+1]));
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

    public void addEdge(Integer vertexA, Integer vertexB) {
        this.adjacentMatrix.get(vertexA).set(vertexB, 1);
    }

    @Override
    public Integer countNeighborhoods(Integer node) {
        return getNeighborhoods(node).size();
    }
}
