package com.company;

import java.util.ArrayList;
import java.util.NavigableMap;

public class Node implements IConnectable, IShortNameable {

    private Graph graph;
    final private String name;
    final private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Node(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public Boolean IsNodeConnected(Node node) {
        final ArrayList<Edge> edges = graph.getEdges();
        for (Edge edge: edges) {
            if(edge.isSource(this)&&edge.isReceiver(node)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public Boolean IsEdgeConnected(Edge edge) {
        return edge.isMember(this);
    }

    @Override
    public String ShortName() {
        return name;
    }
}
