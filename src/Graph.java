package src;

import java.util.List;

public interface Graph {
    List<List<Integer>> getAdjacentMatrix();
    List<Integer> getNeighborhoods(Integer node);
    Integer countNeighborhoods(Integer node);
}
