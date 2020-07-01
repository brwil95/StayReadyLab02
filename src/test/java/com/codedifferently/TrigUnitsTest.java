package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {
    @Test
    public void swtichUnitModeTest() {
        // Given
        TrigUnits trigUnits = new TrigUnits();

        TrigUnitEnum expected = TrigUnitEnum.RADIANS;

        // When
        trigUnits.switchUnitsMode();
        TrigUnitEnum actual = trigUnits.getMode();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchUnitModeTestString() {
        // Given
        TrigUnits trigUnits = new TrigUnits();

        // When
        trigUnits.switchUnitsMode("radians");
        TrigUnitEnum expected = TrigUnitEnum.RADIANS;
        TrigUnitEnum actual = trigUnits.getMode();

        // Then
        Assert.assertEquals(expected, actual);

        // When
        trigUnits.switchUnitsMode("degrees");
        expected = TrigUnitEnum.DEGREES;
        actual = trigUnits.getMode();

        // Then
        Assert.assertEquals(expected, actual);

    }
}