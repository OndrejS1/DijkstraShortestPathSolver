package com.czu.project.translator;

import com.czu.project.model.GraphPayload;
import com.czu.project.model.Node;

import java.util.ArrayList;

public class InputTranslator {

    public static ArrayList<Node> translate(GraphPayload graphPayload) {

        ArrayList<Node> inputNodes = new ArrayList<>();
        graphPayload.getListOfNodes().forEach(node -> inputNodes.add(new Node(node)));

        inputNodes.forEach(node -> graphPayload.getDestinationsList().forEach(destination -> {
            if(destination.getOrigin().equals(node.getName())) {
                inputNodes.forEach(in -> {
                    if(in.getName().equals(destination.getDestination())) {
                        node.addDestination(in, destination.getDistance());
                    }
                });
            }
        }));

        return inputNodes;
    }
}
