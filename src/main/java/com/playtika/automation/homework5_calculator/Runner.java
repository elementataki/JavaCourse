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

public class Runner {

    public static void main(String[] args) {

        System.out.print("Enter expression in the following format: X Operator Y : ");
        Scanner console = new Scanner(System.in);
        String expression = console.nextLine();

        Parser parser = new Parser();
        ParseResult parseResult = parser.parseExpression(expression);

        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(parseResult.operant1, parseResult.operator, parseResult.operant2));
    }

}