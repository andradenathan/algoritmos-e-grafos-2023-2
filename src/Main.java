package src;

import src.graphs.AdjacencyListImpl;

public class Main {
    public static void main(String[] args) {
        // TODO: implementar algoritmos do problema da celebridade e o da metropole.
        AdjacencyListImpl adjacencyListGraph = new AdjacencyListImpl(5);
        adjacencyListGraph.addEdge(1, 2);
        adjacencyListGraph.addEdge(1, 3);
        adjacencyListGraph.addEdge(2, 4);
        adjacencyListGraph.addEdge(2, 5);
        adjacencyListGraph.addEdge(3, 4);
        adjacencyListGraph.addEdge(4, 2);
        adjacencyListGraph.addEdge(5, 3);
        adjacencyListGraph.addEdge(5, 1);
    }
}