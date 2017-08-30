package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;



public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Give
        int[] numbers = {100,364,123,678,24,95,12,456};
        //When
        double average = ArrayOperation.getAverage(numbers);
        //Then
        Assert.assertEquals(231.5, average, 0.001);
    }

    }

