package com.company;

import java.util.ArrayList;
import java.util.function.Function;

public class Graph<NodeT,EdgeT> {

    final private ArrayList<Node<NodeT>> nodes;
    final private ArrayList<Edge<EdgeT>> edges;
    final private String name;
    final private String description;

    public ArrayList<Node<NodeT>> getNodes() {
        return nodes;
    }

    public ArrayList<Edge<EdgeT>> getEdges() {
        return edges;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Graph(ArrayList<Node<NodeT>> nodes, ArrayList<Edge<EdgeT>> edges, String name, String description) {
        this.nodes = nodes;
        this.edges = edges;
        this.name = name;
        this.description = description;
    }

    public ArrayList<Node<NodeT>> filterNodes(Function<Node<NodeT>,Boolean> filter)
    {
        ArrayList<Node<NodeT>> nodeList = new ArrayList<>();
        for (Node<NodeT> node: this.nodes) {
            if(filter.apply(node))
                nodeList.add(node);
        }
        return nodeList;
    }

    public ArrayList<Edge<EdgeT>> filterEdges(Function<Edge<EdgeT>,Boolean> filter)
    {
        ArrayList<Edge<EdgeT>> edgeList = new ArrayList<>();
        for (Edge<EdgeT> edge:edges) {
            if (filter.apply(edge))
                edgeList.add(edge);
        }
        return edgeList;
    }
}
