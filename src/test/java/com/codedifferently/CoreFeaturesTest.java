package com.codedifferently;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {

    @Test
    public void additionTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 20;
        double num1 = 15;

        double expectedResult = 35;

        // When
        coreFeatures.setCurrentValue(currentValue);
        double actualResult = coreFeatures.addition(num1);

        // Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void subtractionTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 69;
        double num1 = 70;

        double expectedResult = -1;

        // When
        coreFeatures.setCurrentValue(currentValue);
        double actualResult = coreFeatures.subtraction(num1);

        // Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void multiplicationTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 19;
        double num1 = 125;

        double expectedResult = 2375;

        // When
        coreFeatures.setCurrentValue(currentValue);
        double actualResult = coreFeatures.multiplication(num1);

        // Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void divisionTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 99;
        double num1 = 10;

        double expectedResult = 9.9;

        // When
        coreFeatures.setCurrentValue(currentValue);
        double actualResult = coreFeatures.division(num1);

        // Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void dividingByZeroTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 75;
        double num1 = 0;

        // When
        coreFeatures.setCurrentValue(currentValue);
        coreFeatures.division(num1);

        // Then
        Assert.assertEquals(0, num1, 0);
    }

    @Test
    public void squareNumTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 6;

        double expectedResult = 36;

        // When
        coreFeatures.setCurrentValue(currentValue);
        double actualResult = coreFeatures.squareNum();

        // Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void squareRootTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 100;

        double expectedResult = 10;

        // When
        coreFeatures.setCurrentValue(currentValue);
        double actualResult = coreFeatures.squareRoot();

        // Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void numExponentTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 2;
        double num1 = 6;

        double expectedResult = 64;

        // When
        coreFeatures.setCurrentValue(currentValue);
        double actualResult = coreFeatures.numExponent(num1);

        // Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void inverseNumTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 56;

        double expectedResult = 0.017857142857142856;

        // When
        coreFeatures.setCurrentValue(currentValue);
        double actualResult = coreFeatures.inverseNum();

        // Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void inverseByZeroTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();
        double currentValue = 0;
        // When
        coreFeatures.setCurrentValue(currentValue);
        coreFeatures.inverseNum();

        // Then
        Assert.assertEquals(0, currentValue, 0);

    }

    @Test
    public void invertNumTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 88;

        double expectedResult = -88;

        // When
        coreFeatures.setCurrentValue(currentValue);
        double actualResult = coreFeatures.invertNum();

        // Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void factorialTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 4;

        double expectedResult = 24;

        // When
        coreFeatures.setCurrentValue(currentValue);
        double actualResult = coreFeatures.factorial(currentValue);

        // Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void logarithmicTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 4;

        double expectedResult = 1.3862943611198906;

        // When
        coreFeatures.setCurrentValue(currentValue);
        double actualResult = coreFeatures.logarithmic();

        // Then
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void inverseNaturalLogarithmTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 2;

        double expectedResult = 7.38905609893065;

        // When
        coreFeatures.setCurrentValue(currentValue);
        double actualResult = coreFeatures.inverseNaturalLogarithm();

        // Then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

    @Test
    public void inverseLogarithmTest() {
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        double currentValue = 2;

        double expectedResult = 0.3010299956639812;

        // When
        coreFeatures.setCurrentValue(currentValue);
        double actualResult = coreFeatures.inverseLogarithm();

        // Then
        Assert.assertEquals(expectedResult, actualResult, 0);

    }

}