package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args) {
        Calculator testCalculator = new Calculator();
        int result = testCalculator.addAtoB(10,5);
        int result2 = testCalculator.subtractAfromB(10,5);

        if( result == 15) {
            System.out.println("test OK");
        } else {
            System.out.println("error");
        }
        if( result2 == 5) {
            System.out.println("test OK");
        } else {
            System.out.println("error");
        }
    }
}