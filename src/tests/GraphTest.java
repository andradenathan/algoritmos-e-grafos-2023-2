package src.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import src.AdjacentMatrixGraph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraphTest {

    @Test
    public void createAdjacentMatrixGraph() {
        List<List<Integer>> adjacentMatrix = new ArrayList<>(6);
        adjacentMatrix.add(Collections.emptyList());
        adjacentMatrix.add(List.of(0, 1, 1, 1, 1));
        adjacentMatrix.add(List.of(1, 0, 0, 1, 0));
        adjacentMatrix.add(List.of(1, 1, 1, 1, 1));
        adjacentMatrix.add(List.of(1, 1, 0, 0, 0));
        adjacentMatrix.add(List.of(1, 0, 1, 0, 0));
        AdjacentMatrixGraph adjacentMatrixGraph = new AdjacentMatrixGraph(adjacentMatrix);
        assertEquals(adjacentMatrixGraph.getNeighborhoods(1), List.of(2, 3, 4, 5));
    }
}
