package com.czu.project.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Destination {

    @ApiModelProperty
    private String origin;

    @ApiModelProperty
    private int distance;

    @ApiModelProperty
    private String destination;

    public Destination(String origin, int distance, String destination) {
        this.origin = origin;
        this.distance = distance;
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
