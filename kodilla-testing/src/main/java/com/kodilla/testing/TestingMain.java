package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy");
        Calculator calculator = new Calculator();

        int addResult = calculator.add(120,34);
        int subtractResult = calculator.subtract(120,34);

        if (addResult == 154) {
            System.out.println("Add - test OK");
        } else {
            System.out.println("Add - Error!");
        }

        if (subtractResult == 86) {
            System.out.println("Subtract - test OK");
        } else {
            System.out.println("Subtract - Error!");
        }



    }
}
