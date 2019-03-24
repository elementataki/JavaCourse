package com.playtika.automation.homework5_calculator;

/*
На основе калькулятора net.wolf.javacourse.calculator создать собственную программу - калькулятор. Реализовать методы:
сложение 			(X + Y)
вычитание 			(X - Y)
умножение 			(X * Y)
деление 			(X / Y)
возведение в степень 	(X ^ Y)
логарифм по основанию 	(X log Y)
корень 			(X sqrt Y)

Команда должна создаваться в отдельном классе.

Пользователь вводит выражение X Operator Y, где X и Y - числа, и получает ответ.

Парсинг выражения пользователя должен происходить также в отдельном классе.

Примичание:
1. логарифм по основанию можно преобразовать:
logB ( N ) = log (N) / log (B)
то есть, логарифм с основанием 2 от 256 = Math.log(256) / Math.log(2)

2. корень N-степени из числа A можно преобразовать в A в степени 1/N
Math.pow(A, 1.0/N)
*/

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.print("Enter expression: ");
        Scanner console = new Scanner(System.in);
        String expression = console.nextLine();

        Parsing operator = new Parsing();

        System.out.println(calculator.calculate(Double.parseDouble(operator.parseExpression(expression)[0]),
                                                Double.parseDouble(operator.parseExpression(expression)[2]),
                                                operator.parseExpression(expression)[1]));
    }

    private double calculate(double val1, double val2, String operator) {
        BinaryOperation operation = getOperationFor(operator);

        if (operation == null) {
            System.out.println("Unknown operator " + operator);
            return Double.NaN;
        }
        return operation.getResultFor(val1, val2);
    }

    private BinaryOperation getOperationFor(String operator) {
        if ("+".equals(operator)) {
            return new Addition();
        } else if ("-".equals(operator)) {
            return new Substraction();
        } else if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("/".equals(operator)) {
            return new Division();
        } else if ("^".equals(operator)) {
            return new Exponentiation();
        } else if ("log".equals(operator)) {
            return new Logarithm();
        } else if ("sqrt".equals(operator)) {
            return new Radical();
        }
        return null;
    }

}