package com.czu.project.controller;

import com.czu.project.model.Graph;
import com.czu.project.model.GraphPayload;
import com.czu.project.model.Node;
import com.czu.project.service.DijkstraService;
import com.czu.project.translator.InputTranslator;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class CzuAlgoController {

    @PostMapping(path = "/solveDijsktra/{targetNode}")
    public String solveDajkstra(
            @PathVariable String targetNode,
            @RequestBody GraphPayload graphPayload) {

       Graph graph = new Graph();

       ArrayList<Node> inputNodes = InputTranslator.translate(graphPayload);
       inputNodes.forEach(graph::addNode);

       Graph solvedGraph = DijkstraService.calculateShortestPathFromSource(graph, inputNodes.get(0));

       ArrayList<String> response = new ArrayList<>();

       solvedGraph.getNodes().forEach(node -> {
           if(node.getName().equals(targetNode)) {
               for (Node nodemond : node.getShortestPath()) {
                  response.add(" [ " + nodemond.getName() + "," + nodemond.getDistance() + " ]");
               }
               response.add(" [ " + node.getName() + "," + node.getDistance() + " ]");
           }
       });

       // If you input node that is not part of the actual graph
       if(response.isEmpty()){
           return "Node " + targetNode + " is not part of the graph";
       }

        return String.join(" --> ",  response.toArray(new String[0]));
    }
}
