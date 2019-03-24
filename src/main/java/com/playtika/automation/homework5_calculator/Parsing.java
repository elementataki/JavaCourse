package com.playtika.automation.homework5_calculator;

public class Parsing {

    public String[] parseExpression(String expression) {

        String[] values = expression.split("\\s");

        return values;
    }

}