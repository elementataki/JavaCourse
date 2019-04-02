package com.playtika.automation.homework5and6_calculator;

public class ParseResult {

    double operant1;
    double operant2;
    Operator operator;

    public ParseResult(double operant1, Operator operator, double operant2) {
        this.operant1 = operant1;
        this.operant2 = operant2;
        this.operator = operator;
    }

}