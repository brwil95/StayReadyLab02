package com.codedifferently;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisplayModeTest {

    @Test
    public void switchDisplayModeTest() {

        // Given
        DisplayMode displayMode = new DisplayMode();

        // When
        displayMode.switchDisplayMode();
        // Then
        Assert.assertEquals(displayMode.getMode(), DisplayEnum.OCTAL);

        // When
        displayMode.switchDisplayMode();
        // Then
        Assert.assertEquals(displayMode.getMode(), DisplayEnum.DECIMAL);

        // When
        displayMode.switchDisplayMode();
        // Then
        Assert.assertEquals(displayMode.getMode(), DisplayEnum.HEXADECIMAL);

        // When
        displayMode.switchDisplayMode();
        // Then
        Assert.assertEquals(displayMode.getMode(), DisplayEnum.BINARY);

    }

    @Test
    public void switchDisplayModeStringTest() {

        // Given
        DisplayMode displayMode = new DisplayMode();

        // When
        displayMode.switchDisplayMode("octal");
        // Then
        Assert.assertEquals(displayMode.getMode(), DisplayEnum.OCTAL);

        // When
        displayMode.switchDisplayMode("decimal");
        // Then
        Assert.assertEquals(displayMode.getMode(), DisplayEnum.DECIMAL);

        // When
        displayMode.switchDisplayMode("hexadecimal");
        // Then
        Assert.assertEquals(displayMode.getMode(), DisplayEnum.HEXADECIMAL);

        // When
        displayMode.switchDisplayMode("binary");
        // Then
        Assert.assertEquals(displayMode.getMode(), DisplayEnum.BINARY);

    }

}