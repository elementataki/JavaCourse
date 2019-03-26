package com.playtika.automation.homework5_calculator.operations;

import com.playtika.automation.homework5_calculator.BinaryOperation;

public class Logarithm implements BinaryOperation {

    public double getResultFor(double base, double number) {
        return Math.log(number) / Math.log(base);
    }

}