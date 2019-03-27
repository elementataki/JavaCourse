package com.playtika.automation.homework5_calculator;

public class Calculator {

    public double calculate(double op1, Operator operator, double op2) {

        OperationFactory factory = new OperationFactory();

        BinaryOperation operation = factory.getOperationFor(operator);

        return operation.getResultFor(op1, op2);
    }

}
