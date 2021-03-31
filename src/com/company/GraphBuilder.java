package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class GraphBuilder extends AbstractBuilder<Graph>{
    private ArrayList<Node> nodes;
    private ArrayList<Edge> edges;
    private String name;
    private String description;
    private int buildedNum;

    public GraphBuilder(){
        name = null;
        description = null;
        nodes = new ArrayList<Node>();
        edges = new ArrayList<Edge>();
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
    public void addNodes(ArrayList<Node> nodes) {
        for (Node node:nodes)
            if(node!=null)
                this.nodes.add(node);
    }
    public void addEdges(ArrayList<Edge> edges) {
        for (Edge edge:edges) this.edges.add(edge);
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Graph build() {
        buildedNum++;
        Graph graph = new Graph(nodes, edges, name, description);
        for (Node node:nodes) {
            node.setGraph(graph);
        }
        for (Edge edge: edges) {
            edge.setGraph(graph);
        }
        return graph;
    }
}