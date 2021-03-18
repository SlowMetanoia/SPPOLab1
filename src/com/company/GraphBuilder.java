package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class GraphBuilder<NodeT,EdgeT> extends AbstractBuilder<Graph>{
    private ArrayList<Node<NodeT>> nodes;
    private ArrayList<Edge<EdgeT>> edges;
    private String name;
    private String description;
    private int buildedNum;

    GraphBuilder(){
        name = null;
        description = null;
        nodes = new ArrayList<Node<NodeT>>();
        edges = new ArrayList<Edge<EdgeT>>();
        buildedNum = 0;
    }
    GraphBuilder(Graph graph)
    {
        if((name == null)&&(description == null))
        {
            this.name = graph.getName();
            this.description = graph.getDescription();
        }
        buildedNum = 0;
    }
    public void addNodes(ArrayList<Node<NodeT>> nodes) {
        for (Node<NodeT> node:nodes)
            if(node!=null)
                this.nodes.add(node);
    }
    public void addEdges(Edge<EdgeT>[] edges) {
        for (Edge<EdgeT> edge:edges) this.edges.add(edge);
    }

    public int getBuildedNum() {
        return buildedNum;
    }

    public ArrayList<Node<NodeT>> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node<NodeT>> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<Edge<EdgeT>> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge<EdgeT>> edges) {
        this.edges = edges;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Graph build() {
        buildedNum++;
        return new Graph(nodes,edges,name,description);
    }
}