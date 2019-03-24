package com.playtika.automation.homework5_calculator;

public class Division implements BinaryOperation {

    public double getResultFor(double left, double right) {
        if (right == 0) {
            throw new ArithmeticException("Error. Division by zero is not allowed");
        } else {
            return left / right;
        }
    }

}