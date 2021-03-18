package com.company;

public class Edge<T> {
    final public String name;
    final public String description;
    final public T value;
    final public Node source;
    final public Node receiver;

    public Edge(String name, String description, T value, Node source, Node receiver) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.source = source;
        this.receiver = receiver;
    }
    boolean isMember(Node node) {return node == source||node == receiver;}
}
