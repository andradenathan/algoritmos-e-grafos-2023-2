package src.tests;
import org.junit.Before;
import org.junit.Test;
import src.graphs.AdjacencyMatrixImpl;
import src.graphs.Graph;
import src.graphs.algorithms.BreadthFirstSearch;
import src.graphs.algorithms.DepthFirstSearch;
import src.graphs.algorithms.DepthFirstSearch.VerticesOrderList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class SearchTest {
    private Graph graph;
    @Before
    public void setUp() {
        graph = new AdjacencyMatrixImpl(5);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);

        graph.addEdge(1, 3);

        graph.addEdge(3, 4);
        graph.addEdge(3, 2);

        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(4, 2);
    }

    @Test
    public void executeBreadthFirstSearchTest() {
        BreadthFirstSearch bfs = new BreadthFirstSearch(graph);
        List<Integer> result = bfs.search();
        assertEquals(1, (int) result.get(result.size() - 1));
    }

    @Test
    public void executeDepthFirstSearchTest() {
        DepthFirstSearch dfs = new DepthFirstSearch(graph);
        VerticesOrderList result = dfs.search();
        assertEquals(0, (int) result.entry().get(0));
    }
}
