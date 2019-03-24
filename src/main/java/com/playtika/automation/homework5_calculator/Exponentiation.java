package com.playtika.automation.homework5_calculator;

public class Exponentiation implements BinaryOperation {

    public double getResultFor(double left, double right) {
        return Math.pow(left, right);
    }

}