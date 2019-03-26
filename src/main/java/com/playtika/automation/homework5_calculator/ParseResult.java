package com.playtika.automation.homework5_calculator;

public class ParseResult {

    double op1;
    double op2;
    Operator operator;

    public ParseResult(double op1, Operator operator, double op2) {
        this.op1 = op1;
        this.op2 = op2;
        this.operator = operator;
    }

}