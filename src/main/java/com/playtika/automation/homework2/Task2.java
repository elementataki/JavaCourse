package com.playtika.automation.homework2;

/*
Есть целое положительное число (long). Программа должна определить сумму цифр из которых состоит число.

        Сумма цифр числа 15875 => 26
*/

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Enter a positive number: ");
        Scanner enterValue = new Scanner(System.in);
        long numberToDecompose = enterValue.nextLong();

        determineSumOfDigits(numberToDecompose);
    }

    private static void determineSumOfDigits(long numberToDecompose) {

        int sumOfDigits = 0;

        while (numberToDecompose != 0) {

            int divisionReminder = (int) (numberToDecompose % 10);

            numberToDecompose = numberToDecompose / 10;

            sumOfDigits += divisionReminder;
        }
        System.out.println(sumOfDigits);
    }
}