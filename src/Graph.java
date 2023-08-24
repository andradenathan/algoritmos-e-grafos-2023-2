package src;

import java.util.List;

public interface Graph {
    List<Integer> getNeighborhoods(Integer node);
    Integer countNeighborhoods(Integer node);
}
