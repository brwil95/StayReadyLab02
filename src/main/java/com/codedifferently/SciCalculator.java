package com.codedifferently;

public class SciCalculator {

    protected double currentValue;
    protected double displayVaule;
    private TrigUnits trigUnits;
    private Memory memory;
    private DisplayMode displayMode;

    public SciCalculator() {
        this.currentValue = 0;
        this.trigUnits = new TrigUnits();
        this.memory = new Memory();
        this.displayMode = new DisplayMode();

    }

    protected void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double getCurrentValue() {
        return this.currentValue;
    }

    public double clearDisplayVaule() {
        return this.currentValue;
    }

    public TrigUnits getTrigUnits() {
        return this.trigUnits;
    }

    public Memory getMemory() {
        return this.memory;
    }

    public DisplayMode getDisplayMode() {
        return this.displayMode;
    }
}
