package com.playtika.automation.homework5_calculator;

import static com.playtika.automation.homework5_calculator.Operator.ADDITION;
import static com.playtika.automation.homework5_calculator.Operator.DIVISION;
import static com.playtika.automation.homework5_calculator.Operator.EXPONENTIATION;
import static com.playtika.automation.homework5_calculator.Operator.LOGARITHM;
import static com.playtika.automation.homework5_calculator.Operator.MULTIPLICATION;
import static com.playtika.automation.homework5_calculator.Operator.RADICAL;
import static com.playtika.automation.homework5_calculator.Operator.SUBTRACTION;

public class Parser {

    public ParseResult parseExpression(String expression) {

        String[] values = expression.split("\\s");

        if (values.length == 3) {

            Double op1 = Double.parseDouble(values[0]);
            Double op2 = Double.parseDouble(values[2]);
            Operator operator = getOperator(values[1]);

            return new ParseResult(op1, operator, op2);
        }
        throw new RuntimeException("Enter 3 ");
    }

    private Operator getOperator(String operator) {
        if ("+".equals(operator)) {
            return ADDITION;
        }
        if ("-".equals(operator)) {
            return SUBTRACTION;
        }
        if ("*".equals(operator)) {
            return MULTIPLICATION;
        }
        if ("/".equals(operator)) {
            return DIVISION;
        }
        if ("^".equals(operator)) {
            return EXPONENTIATION;
        }
        if ("log".equals(operator)) {
            return LOGARITHM;
        }
        if ("sqrt".equals(operator)) {
            return RADICAL;
        } else {
            throw new RuntimeException("Unknown operator " + operator);
        }
    }

}