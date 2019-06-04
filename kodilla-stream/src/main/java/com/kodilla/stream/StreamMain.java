package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("love", txt -> "ABC" + txt + "ABC");
        poemBeautifier.beautify("love", txt -> txt.toUpperCase());
        poemBeautifier.beautify("love", txt -> "*" + txt.substring(0,1) + "*" + txt.substring(1,2) + "*" + txt.substring(2,3) + "*" + txt.substring(3,4) + "*");
        poemBeautifier.beautify("love",txt -> txt.substring(0,1).toUpperCase()+txt.substring(1,2)+txt.substring(2,3).toUpperCase()+txt.substring(3,4));

    }
}
