package com.playtika.automation.homework5_calculator.operations;

import com.playtika.automation.homework5_calculator.BinaryOperation;

public class Radical implements BinaryOperation {

    public double getResultFor(double index, double radicand) {
        if (index == 0) {
            throw new ArithmeticException("Error. Index can not equal to zero");
        } else if (radicand < 0) {
            throw new ArithmeticException("Error. Radicand can not be negative");
        } else {
            return Math.pow(radicand, 1.0 / index);
        }
    }

}