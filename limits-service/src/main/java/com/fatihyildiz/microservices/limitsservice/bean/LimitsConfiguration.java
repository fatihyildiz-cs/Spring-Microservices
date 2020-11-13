package com.fatihyildiz.microservices.limitsservice.bean;

public class LimitsConfiguration {

    private int maximum;
    private int minimum;

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public LimitsConfiguration(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    protected LimitsConfiguration() {
    }
}
