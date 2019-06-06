package com.kodilla.stream.array;

import org.junit.Test;
import org.junit.Assert;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        double expectedResult = 10.5;
        Assert.assertEquals(expectedResult,result,0.01);
    }
    @Test
    public void testGetAverageEmptyArray() {
        //Given
        int[] numbers = {};
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        double expectedResult = 0;
        Assert.assertEquals(expectedResult,result,0.01);
    }
}
