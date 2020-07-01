package com.codedifferently;

import java.util.Currency;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {

    @Test
    public void addAndRecallToMemoryTest() {
        // Given
        Memory memory = new Memory();
        double currentValue = 5;
        double expectedResult = 5;

        // When
        memory.addToMemory(currentValue);

        // Then
        Assert.assertEquals(expectedResult, memory.reCallMemory(), 0);
    }

    @Test
    public void resetMemoryTest() {
        // Given
        Memory memory = new Memory();
        double storeNumber = 15;

        // When
        memory.addToMemory(storeNumber);
        Assert.assertEquals((double) 15, memory.reCallMemory(), 0);

        // Then
        memory.resetMemory();
        Assert.assertEquals((double) 0, memory.reCallMemory(), 0);

    }

}