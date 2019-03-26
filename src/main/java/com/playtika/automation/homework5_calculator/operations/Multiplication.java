package com.playtika.automation.homework5_calculator.operations;

import com.playtika.automation.homework5_calculator.BinaryOperation;

public class Multiplication implements BinaryOperation {

    public double getResultFor(double multiplicand, double multiplier) {
        return multiplicand * multiplier;
    }

}