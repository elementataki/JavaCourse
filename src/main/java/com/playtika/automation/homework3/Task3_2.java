package com.playtika.automation.homework3;

/*
Двумерный массив c рандомными числами.
Вывести числа, которые лежат сначала на одной диагонали, а потом на второй.
*/

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task3_2 {

    public static void main(String[] args) {

        final int MAX_VALUE = 999;

        Scanner console = new Scanner(System.in);
        System.out.print("Enter the 1D size: ");
        int d1 = console.nextInt();
        System.out.print("Enter the 2D size: ");
        int d2 = console.nextInt();

        int[][] array = new int[d1][d2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(MAX_VALUE);
            }
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("The main diagonal of the matrix consists of the following elements:");

        findMainDiagonal(array);

        System.out.println();

        System.out.println("The antidiagonal of the matrix consists of the following elements:");

        findAntidiagonal(array);
    }

    private static void findMainDiagonal(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }

    private static void findAntidiagonal(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) == array.length - 1) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}