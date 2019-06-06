package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        IntStream stream = IntStream.range(0,numbers.length);
        stream.forEach(num -> System.out.println(numbers[num]));

        IntStream stream1 = IntStream.range(0,numbers.length).map(num -> numbers[num]);
        OptionalDouble average = stream1.average();
        return average.orElse(0);
    }
}
