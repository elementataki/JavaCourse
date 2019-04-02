package com.playtika.automation.homework5and6_calculator.operations;

import com.playtika.automation.homework5and6_calculator.BinaryOperation;

public class Division implements BinaryOperation {

    public double getResultFor(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Error. Division by zero is not allowed");
        } else {
            return dividend / divisor;
        }
    }

}