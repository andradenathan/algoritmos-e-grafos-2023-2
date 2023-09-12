package src.graphs;

import java.util.List;

public interface Graph {
    void addEdge(Integer vertexA, Integer vertexB);
    List<Integer> getNeighborhoods(Integer node);
    Integer countNeighborhoods(Integer node);
    boolean isNeighborhood(Integer vertexA, Integer vertexB);

//    int numberOfVertices();
}
