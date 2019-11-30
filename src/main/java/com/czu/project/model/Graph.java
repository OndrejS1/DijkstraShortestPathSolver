package com.czu.project.model;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    public Graph() {
    }

    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }


}
