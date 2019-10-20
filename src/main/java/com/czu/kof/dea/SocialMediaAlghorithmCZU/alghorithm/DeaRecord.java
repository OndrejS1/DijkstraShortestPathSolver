package com.czu.kof.dea.SocialMediaAlghorithmCZU.alghorithm;

public class DeaRecord {

    /**
     * The values of features that are considered as input. It can be empty if
     * if no input is assumed.
     */
    private final double[] input;

    /**
     * The values of features that are considered as output.
     */
    private final double[] output;

    /**
     * Constructor of DEA Record with only output
     *
     * @param output    The output part of our data record
     */
    public DeaRecord(double[] output) {
        this.output=output;
        this.input= new double[0];
    }



    /**
     * Constructor of DEA Record with both input and output
     *
     * @param output    The output part of our data record
     * @param input     The input part of our data record
     */
    public DeaRecord(double[] output, double[] input) {
        this.output=output;
        this.input=input;
    }

    /**
     * Getter for input
     *
     * @return  Returns the input part of our data.
     */
    public double[] getInput() {
        return input;
    }

    /**
     * Getter for output
     *
     * @return  Returns the output part of our data.
     */
    public double[] getOutput() {
        return output;
    }

}
