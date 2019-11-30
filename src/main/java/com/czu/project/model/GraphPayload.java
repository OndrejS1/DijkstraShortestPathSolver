package com.czu.project.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel
public class GraphPayload {

   @ApiModelProperty
   private List<String> listOfNodes;

   @ApiModelProperty
   private List<Destination> destinationsList;

    public GraphPayload(List<String> listOfNodes, List<Destination> destinationsList) {
        this.listOfNodes = listOfNodes;
        this.destinationsList = destinationsList;
    }

    public List<String> getListOfNodes() {
        return listOfNodes;
    }

    public void setListOfNodes(List<String> listOfNodes) {
        this.listOfNodes = listOfNodes;
    }

    public List<Destination> getDestinationsList() {
        return destinationsList;
    }

    public void setDestinationsList(List<Destination> destinationsList) {
        this.destinationsList = destinationsList;
    }
}
