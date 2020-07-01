package com.codedifferently;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest {

    @Test
    public void setCurrentValueTest() {
        // Given
        SciCalculator sciCalculator = new SciCalculator();

        // When
        sciCalculator.setCurrentValue(4);

        // Then
        Assert.assertEquals(4, sciCalculator.getCurrentValue(), 0);
    }

    @Test
    public void clearDisplayModeTest() {
        // Given
        SciCalculator sciCalculator = new SciCalculator();

        // When
        sciCalculator.setCurrentValue(0);

        // Then
        Assert.assertEquals(0, sciCalculator.clearDisplayVaule(), 0);
    }

    @Test
    public void getCurrentValueTest() {
        // Given
        SciCalculator sciCalculator = new SciCalculator();

        // When
        sciCalculator.setCurrentValue(4);

        // Then
        Assert.assertEquals(sciCalculator.getCurrentValue(), 4, 0);
        ;
    }

}
