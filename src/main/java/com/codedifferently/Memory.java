package com.codedifferently;

public class Memory {

    private double savedValue;

    public Memory() {
        this.savedValue = 0;
    }

    public void addToMemory(double number) {
        this.savedValue = number;
    }

    public void resetMemory() {
        this.savedValue = 0;
    }

    public double reCallMemory() {
        return this.savedValue;
    }

}