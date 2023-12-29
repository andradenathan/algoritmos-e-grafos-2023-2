package src.tests;

import org.junit.Test;
import static org.junit.Assert.*;

import src.graphs.AdjacencyListImpl;
import src.graphs.AdjacencyMatrixImpl;
import src.graphs.Graph;

import java.util.List;

public class GraphTest {

    @Test
    public void createAdjacentListGraph() {
        AdjacencyListImpl adjacencyListGraph = new AdjacencyListImpl(6);
        addGraphNeighborhoods(adjacencyListGraph);

        assertEquals(
                adjacencyListGraph.getNeighborhoods(1),
                List.of(2, 3, 4, 5)
        );
    }

    @Test
    public void createAdjacentMatrixGraph() {
        AdjacencyMatrixImpl adjacentMatrixGraph = new AdjacencyMatrixImpl(6);
        addGraphNeighborhoods(adjacentMatrixGraph);

        assertEquals(
                adjacentMatrixGraph.getNeighborhoods(1),
                List.of(2, 3, 4, 5)
        );
    }

    private void addGraphNeighborhoods(Graph graph) {
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(1, 5);

        graph.addEdge(2, 1);
        graph.addEdge(2, 4);

        graph.addEdge(3, 1);
        graph.addEdge(3, 2);
        graph.addEdge(3, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);

        graph.addEdge(4, 1);
        graph.addEdge(4, 2);

        graph.addEdge(5, 1);
        graph.addEdge(5, 3);
    }
}