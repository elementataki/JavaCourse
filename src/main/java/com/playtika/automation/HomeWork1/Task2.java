package com.playtika.automation.HomeWork1;

/*
Задание 2.
        Составить программу, которая будет раcкладывать 5-ти значное число на отдельные цифры данного числа, слева-направо.
        Число задается в параметре статического метода.
        Каждую цифру вывести в отдельной строке.
        45685
        4
        5
        6
        8
        5
*/

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.print("Enter the 5-digits number you want to decompose: ");

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        numberDecomposition(n);

    }

    private static void numberDecomposition(int n) {

        int d1 = n / 10000;
        int d2 = subtraction(n, d1 * 10000) / 1000;
        int d3 = subtraction(n, addition(d1 * 10000, d2 * 1000)) / 100;
        int d4 = subtraction(n, addition(d1 * 10000, addition(d2 * 1000, d3 * 100))) / 10;
        int d5 = subtraction(n, addition(d1 * 10000, addition(d2 * 1000, addition(d3 * 100, d4 * 10))));

        System.out.printf("Decomposition of the %d number is the following:%n", n);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }

    private static int addition(int x, int y) {
        return x + y;
    }

    private static int subtraction(int x, int y) {
        return x - y;
    }

}