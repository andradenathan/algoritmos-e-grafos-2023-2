package src.graphs.algorithms;

import src.graphs.Graph;

public class TopSort {
    private Graph graph;
    private int root = 1;
    public TopSort(Graph graph) {
        this.graph = graph;
    }

    public TopSort(Graph graph, int root) {
        this.graph = graph;
        this.root = root;
    }

    public static void sort() {
        //TODO: implementar DepthFirstSearch primeiro
    }
}
