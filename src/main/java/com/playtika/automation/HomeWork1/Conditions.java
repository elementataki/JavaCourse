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

            System.out.println("Result is: " + addition(a, b));

        } else if (a > 0 && b < 0) {

            System.out.println("Result is: " + subtraction(a, b));

        } else if (a <0 && b > 0) {

            System.out.println("Result is: " + multiplication(a, b));

        } else if (a < 0 && b < 0) {

            System.out.println("Result is: " + division(a, b));

        } else {

            System.out.println(0);
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