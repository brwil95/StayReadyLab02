package com.codedifferently;

enum TrigUnitEnum {
    DEGREES, RADIANS
}

public class TrigUnits {

    private TrigUnitEnum setMode;

    public TrigUnits() {
        this.setMode = TrigUnitEnum.DEGREES;

    }

    public void switchUnitsMode() {
        if (this.setMode == TrigUnitEnum.DEGREES) {
            this.setMode = TrigUnitEnum.RADIANS;
        } else {
            this.setMode = TrigUnitEnum.DEGREES;
        }

    }

    public void switchUnitsMode(String setMode) {
        if (setMode.equalsIgnoreCase("degrees")) {
            this.setMode = TrigUnitEnum.DEGREES;
        } else if (setMode.equalsIgnoreCase("radians")) {
            this.setMode = TrigUnitEnum.RADIANS;
        }
    }

    public TrigUnitEnum getMode() {
        return this.setMode;
    }

}