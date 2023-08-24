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
        AdjacentMatrixGraph adjacentMatrixGraph = new AdjacentMatrixGraph(6);
        adjacentMatrixGraph.addEdge(1, 2);
        adjacentMatrixGraph.addEdge(1, 3);
        adjacentMatrixGraph.addEdge(1, 4);
        adjacentMatrixGraph.addEdge(1, 5);

        adjacentMatrixGraph.addEdge(2, 1);
        adjacentMatrixGraph.addEdge(2, 4);

        adjacentMatrixGraph.addEdge(3, 1);
        adjacentMatrixGraph.addEdge(3, 2);
        adjacentMatrixGraph.addEdge(3, 3);
        adjacentMatrixGraph.addEdge(3, 4);
        adjacentMatrixGraph.addEdge(3, 5);

        adjacentMatrixGraph.addEdge(4, 1);
        adjacentMatrixGraph.addEdge(4, 2);

        adjacentMatrixGraph.addEdge(5, 1);
        adjacentMatrixGraph.addEdge(5, 3);

        assertEquals(adjacentMatrixGraph.getNeighborhoods(1), List.of(2, 3, 4, 5));
    }

    @Test
    public void celebrity() {
        AdjacentMatrixGraph adjacentMatrixGraph = new AdjacentMatrixGraph(4);
        adjacentMatrixGraph.addEdge(1, 2);
        adjacentMatrixGraph.addEdge(1, 3);
        adjacentMatrixGraph.addEdge(1, 4);

        adjacentMatrixGraph.addEdge(2, 3);
        adjacentMatrixGraph.addEdge(2, 4);

        adjacentMatrixGraph.addEdge(3, 1);
        adjacentMatrixGraph.addEdge(3, 4);

        // TO DO: Continuar a implementação e pensar numa estratégia para resolver
        // o problema.
    }
}
