package com.playtika.automation.homework5_calculator;

public class Radical implements BinaryOperation {

    public double getResultFor(double left, double right) {
        if (left == 0) {
            throw new ArithmeticException("Error. Left operant can not equal to zero");
        } else if (right < 0) {
            throw new ArithmeticException("Error. Right operant can not be negative");
        } else {
            return Math.pow(right, 1.0 / left);
        }
    }

}