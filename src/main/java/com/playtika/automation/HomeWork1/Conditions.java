package com.playtika.automation.HomeWork1;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

        System.out.println("Enter number a:");
        Scanner consoleA = new Scanner(System.in);
        int a = consoleA.nextInt();

        System.out.println("Enter number b:");
        Scanner consoleB = new Scanner(System.in);
        int b = consoleB.nextInt();

        if (a > 0 && b > 0) {

             System.out.println("Result of addition is: " + addition(a, b));

        } else if (a > 0 && b < 0) {

            System.out.println("Result of subtraction is: " + subtraction(a, b));

        } else if (a <0 && b > 0) {

            System.out.println("Result of multiplication is: " + multiplication(a, b));

        } else if (a < 0 && b < 0) {

            System.out.println("Result of division is: " + division(a, b));

        } else {

            System.out.println("At least one of entered numbers equals to zero");

        }
    }

    private static int addition (int x, int y) {
        return x + y;
    }

    private static int subtraction (int x, int y) {
        return x - y;
    }

    private static int multiplication (int x, int y) {
        return x * y;
    }

    private static double division (int x, int y) {
        return (double) x / y;
    }
}