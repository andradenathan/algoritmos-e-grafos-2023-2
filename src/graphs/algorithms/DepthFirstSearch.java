package src.graphs.algorithms;

import src.graphs.Graph;

import java.util.HashMap;

public class DepthFirstSearch {
    public final Graph graph;
    public final int root;

    // TODO: check whether this name is expressing what I mean or whether I should find another suitable one.
    public record EntryExitPosition(HashMap<String, Integer> entry, HashMap<String, Integer> exit) {}

    public DepthFirstSearch(Graph graph) {
        this.graph = graph;
        this.root = 1;
    }

    public DepthFirstSearch(Graph graph, int root) {
        this.graph = graph;
        this.root = root;
    }

    public EntryExitPosition run() {
        // TODO: implement me!
        return new EntryExitPosition(null, null);
    }
}
