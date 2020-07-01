package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigFunctionsTest {

    @Test
    public void sineTest_Degrees() {
        // Given
        TrigFunctions trigFunctions = new TrigFunctions();
        // When
        Double result = trigFunctions.sine();
        // Then

        Assert.assertEquals((double) 0, result, 0);
    }

    @Test
    public void sineTest_Radians() {
        // Given
        TrigFunctions trigFunctions = new TrigFunctions();
        trigFunctions.setCurrentValue(.3);

        // When
        trigFunctions.getTrigUnits().switchUnitsMode();
        Double result = trigFunctions.sine();
        // Then

        Assert.assertEquals((double) .29552020666133955, result, 0);
    }

    @Test
    public void cosineTest_Degrees() {
        // Given
        TrigFunctions trigFunctions = new TrigFunctions();

        // When
        double result = trigFunctions.cosine();

        // Then
        Assert.assertEquals((double) 1.0, result, 0);
    }

    @Test
    public void cosineTest_Radians() {
        // Given
        TrigFunctions trigFunctions = new TrigFunctions();
        trigFunctions.setCurrentValue(.3);

        // When
        trigFunctions.getTrigUnits().switchUnitsMode();
        double result = trigFunctions.cosine();

        // Then
        Assert.assertEquals((double) .955336489125606, result, 0);
    }

    @Test
    public void tangentTest_Degrees() {
        // Given
        TrigFunctions trigFunctions = new TrigFunctions();

        // When
        double result = trigFunctions.tangent();

        // Then
        Assert.assertEquals((double) 0.0, result, 0);
    }

    @Test
    public void tangentTest_Radians() {
        // Given
        TrigFunctions trigFunctions = new TrigFunctions();
        trigFunctions.setCurrentValue(.3);

        // When
        trigFunctions.getTrigUnits().switchUnitsMode();
        double result = trigFunctions.tangent();

        // Then
        Assert.assertEquals((double) .30933624960962325, result, 0);
    }

    @Test
    public void inverseSineTest_Degrees() {
        // Given
        TrigFunctions trigFunctions = new TrigFunctions();

        // When
        double result = trigFunctions.inverseSine();

        // Then
        Assert.assertEquals((double) 0, result, 0);
    }

    @Test
    public void inverseSineTest_Radians() {
        // Given
        TrigFunctions trigFunctions = new TrigFunctions();
        trigFunctions.setCurrentValue(.3);

        // When
        trigFunctions.getTrigUnits().switchUnitsMode();
        double result = trigFunctions.inverseSine();

        // Then
        Assert.assertEquals((double) .3046926540153975, result, 0);
    }

    @Test
    public void inverseCosineTest_Degrees() {
        // Given
        TrigFunctions trigFunctions = new TrigFunctions();

        // When
        double result = trigFunctions.inverseCos();

        // Then
        Assert.assertEquals((double) 1.5707963267948966, result, 0);
    }

    @Test
    public void inverseCosineTest_Radians() {
        // Given
        TrigFunctions trigFunctions = new TrigFunctions();
        trigFunctions.setCurrentValue(.3);

        // When
        trigFunctions.getTrigUnits().switchUnitsMode();
        ;
        double result = trigFunctions.inverseCos();

        // Then
        Assert.assertEquals((double) 1.2661036727794992, result, 0);
    }

    @Test
    public void inverseTangentTest_Degrees() {
        // Given
        TrigFunctions trigFunctions = new TrigFunctions();

        // When
        double result = trigFunctions.inverseTangent();

        // Then
        Assert.assertEquals((double) 0, result, 0);
    }

    @Test
    public void inverseTangentTest_Radians() {
        // Given
        TrigFunctions trigFunctions = new TrigFunctions();
        trigFunctions.setCurrentValue(.3);

        // When
        trigFunctions.getTrigUnits().switchUnitsMode();
        double result = trigFunctions.inverseTangent();

        // Then
        Assert.assertEquals((double) .2914567944778671, result, 0);
    }

}