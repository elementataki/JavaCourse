package com.playtika.automation.homework5_calculator;

public class Logarithm implements BinaryOperation {

    public double getResultFor(double left, double right) {
        return Math.log(right) / Math.log(left);
    }

}