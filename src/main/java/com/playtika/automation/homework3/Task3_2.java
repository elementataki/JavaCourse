package com.playtika.automation.homework3;

/*
Двумерный массив
*/

import java.util.Arrays;
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

        System.out.printf("2D array = %s%n", Arrays.deepToString(array));

        System.out.println();

        System.out.print("2D array contains the following numbers which are multiplies of 3: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] % 3 == 0) {

                    System.out.print(array[i][j] + ", ");
                }
            }
        }
        System.out.println();
    }
}