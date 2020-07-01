package com.codedifferently;

import java.lang.Math;

public class TrigFunctions extends SciCalculator {
    public TrigFunctions() {
        super();
    }

    public double sine() {
        return Math.sin(getUnit());
    }

    public double cosine() {
        return Math.cos(getUnit());

    }

    public double tangent() {
        return Math.tan(getUnit());

    }

    public double inverseSine() {
        return Math.asin(getUnit());
    }

    public double inverseCos() {
        return Math.acos(getUnit());
    }

    public double inverseTangent() {
        return Math.atan(getUnit());
    }

    private double getUnit() {
        TrigUnits currentUnit = super.getTrigUnits();
        TrigUnitEnum currentEnum = currentUnit.getMode();

        if (currentEnum == TrigUnitEnum.DEGREES) {
            return Math.toRadians(super.getCurrentValue());
        } else {
            return super.getCurrentValue();
        }
    }
}