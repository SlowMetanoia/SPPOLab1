package com.company;

public class Edge implements IConnectable{

    private Graph graph;
    final private String name;
    final private String description;
    final private Node source;
    final private Node receiver;

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    public Graph getGraph() {
        return graph;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Node getSource() {
        return source;
    }

    public Node getReceiver() {
        return receiver;
    }

    public Edge(String name, String description, Node source, Node receiver) {
        this.name = name;
        this.description = description;
        this.source = source;
        this.receiver = receiver;
    }

    boolean isMember(Node node) {return node == source||node == receiver;}
    boolean isSource(Node node) {return node == source;}
    boolean isReceiver(Node node) {return node == receiver;}

    @Override
    public Boolean IsNodeConnected(Node node) {
        return isMember(node);
    }

    @Override
    public Boolean IsEdgeConnected(Edge edge) {
        return edge.isMember(receiver);
    }
}
