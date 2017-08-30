package com.kodilla.stream.array;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperation {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(x -> System.out.println(x));

        double average = IntStream.range(0, numbers.length)
                .map(x -> numbers[x])
                .average()
                .getAsDouble();
        System.out.println(average);

        return average;


    }
}

