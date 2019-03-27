package com.playtika.automation.homework5_calculator;

import com.playtika.automation.homework5_calculator.operations.Addition;
import com.playtika.automation.homework5_calculator.operations.Division;
import com.playtika.automation.homework5_calculator.operations.Exponentiation;
import com.playtika.automation.homework5_calculator.operations.Logarithm;
import com.playtika.automation.homework5_calculator.operations.Multiplication;
import com.playtika.automation.homework5_calculator.operations.Radical;
import com.playtika.automation.homework5_calculator.operations.Subtraction;

public class OperationFactory {

    public BinaryOperation getOperationFor(Operator operator) {
        switch (operator) {
            case ADDITION:
                return new Addition();
            case SUBTRACTION:
                return new Subtraction();
            case MULTIPLICATION:
                return new Multiplication();
            case DIVISION:
                return new Division();
            case EXPONENTIATION:
                return new Exponentiation();
            case LOGARITHM:
                return new Logarithm();
            case RADICAL:
                return new Radical();
            default:
                throw new RuntimeException();
        }
    }

}