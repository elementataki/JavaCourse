package com.playtika.automation.homework1;

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
        int d2 = decompose2(n, d1) / 1000;
        int d3 = decompose3(decompose2(n, d1), d2) / 100;
        int d4 = decompose4(decompose3(decompose2(n, d1), d2), d3) / 10;
        int d5 = decompose5(decompose4(decompose3(decompose2(n, d1), d2), d3), d4);

        System.out.printf("Decomposition of the %d number is the following:%n", n);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }

    private static int decompose2(int x, int y) {
        return x - y * 10000;
    }

    private static int decompose3(int x, int y) {
        return x - y * 1000;
    }

    private static int decompose4(int x, int y) {
        return x - y * 100;
    }

    private static int decompose5(int x, int y) {
        return x - y * 10;
    }
}