package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO: Passar isso para a classe de teste.
public class Main {
    public static void main(String[] args) {
        List<List<Integer>> adjacentMatrix = new ArrayList<>(6);
        adjacentMatrix.add(Collections.emptyList());
        adjacentMatrix.add(List.of(0, 1, 1, 1, 1));
        adjacentMatrix.add(List.of(1, 0, 0, 1, 0));
        adjacentMatrix.add(List.of(1, 0, 0, 0, 1));
        adjacentMatrix.add(List.of(1, 1, 0, 0, 0));
        adjacentMatrix.add(List.of(1, 0, 1, 0, 0));
        SimpleGraph graph = new SimpleGraph(adjacentMatrix);
        System.out.println(graph.getAdjacentMatrix());
        System.out.println(graph.getNeighborhoods(2));
    }
}