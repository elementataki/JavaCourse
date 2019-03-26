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

import com.playtika.automation.homework5_calculator.operations.Addition;
import com.playtika.automation.homework5_calculator.operations.Division;
import com.playtika.automation.homework5_calculator.operations.Exponentiation;
import com.playtika.automation.homework5_calculator.operations.Logarithm;
import com.playtika.automation.homework5_calculator.operations.Multiplication;
import com.playtika.automation.homework5_calculator.operations.Radical;
import com.playtika.automation.homework5_calculator.operations.Subtraction;

public class Calculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.print("Enter expression: ");
        Scanner console = new Scanner(System.in);
        String expression = console.nextLine();

        Parser parser = new Parser();

        ParseResult parseResult = parser.parseExpression(expression);

        System.out.println(calculator.calculate(parseResult.op1, parseResult.operator, parseResult.op2));
    }

    private double calculate(double op1, Operator operator, double op2) {

        BinaryOperation operation = getOperationFor(operator);

        return operation.getResultFor(op1, op2);
    }

    private BinaryOperation getOperationFor(Operator operator) {
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