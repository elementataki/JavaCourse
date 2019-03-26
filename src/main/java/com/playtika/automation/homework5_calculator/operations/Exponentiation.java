package com.playtika.automation.homework5_calculator.operations;

import com.playtika.automation.homework5_calculator.BinaryOperation;

public class Exponentiation implements BinaryOperation {

    public double getResultFor(double base, double power) {
        return Math.pow(base, power);
    }

}