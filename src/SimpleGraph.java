package src;

import java.util.ArrayList;
import java.util.List;

public class SimpleGraph implements Graph {
    private final static Integer isConnected = 1;

    private final List<List<Integer>> adjacentMatrix;

    public SimpleGraph(List<List<Integer>> adjacentMatrix) {
        this.adjacentMatrix = adjacentMatrix;
    }

    public SimpleGraph() {
        this.adjacentMatrix = new ArrayList<>();
    }

    public List<List<Integer>> getAdjacentMatrix() {
        return adjacentMatrix;
    }

    @Override
    public List<Integer> getNeighborhoods(Integer node) {
        List<Integer> neighborhoods = new ArrayList<>();
        for (int vertex = 0; vertex < adjacentMatrix.get(node).size(); vertex++) {
            Integer edge = adjacentMatrix.get(node).get(vertex);
            if (edge != isConnected) continue;
            neighborhoods.add(vertex+1);
        }
        return neighborhoods;
    }

    @Override
    public Integer countNeighborhoods(Integer node) {
        return getNeighborhoods(node).size();
    }
}
