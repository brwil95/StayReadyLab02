package com.codedifferently;

public class CoreFeatures extends SciCalculator {
    public CoreFeatures() {

    }

    public double addition(double num1) {
        return super.getCurrentValue() + num1;
    }

    public double subtraction(double num1) {
        return super.getCurrentValue() - num1;
    }

    public double multiplication(double num1) {
        return super.getCurrentValue() * num1;
    }

    public double division(double num1) {
        if (num1 == 0) {
            return 0;
        }

        return super.getCurrentValue() / num1;
    }

    public double squareNum() {
        return super.getCurrentValue() * super.getCurrentValue();
    }

    public double squareRoot() {
        return Math.sqrt(super.getCurrentValue());
    }

    public double numExponent(double num1) {
        return Math.pow(super.getCurrentValue(), num1);
    }

    public double inverseNum() {
        return ((double) 1 / super.getCurrentValue());
    }

    public double invertNum() {
        return super.getCurrentValue() * -1;

    }

    public double factorial(double num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }

    public double logarithmic() {
        return Math.log(super.getCurrentValue());
    }

    public double inverseNaturalLogarithm() {
        return Math.exp(super.getCurrentValue());
    }

    public double inverseLogarithm() {
        return Math.log10(super.getCurrentValue());
    }

}