package com.playtika.automation.homework3;

/*
Трёхмерный массив
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task3_3 {

    public static void main(String[] args) {

        final int MAX_VALUE = 999;

        Scanner console = new Scanner(System.in);
        System.out.print("Enter the 1D size: ");
        int d1 = console.nextInt();
        System.out.print("Enter the 2D size: ");
        int d2 = console.nextInt();
        System.out.print("Enter the 3D size: ");
        int d3 = console.nextInt();

        int[][][] array = new int[d1][d2][d3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {

                    array[i][j][k] = ThreadLocalRandom.current().nextInt(MAX_VALUE);
                }
            }
        }

        System.out.printf("3D array = %s%n", Arrays.deepToString(array));

        System.out.println();

        System.out.print("3D array contains the following numbers which are multiplies of 3: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {

                    if (array[i][j][k] % 3 == 0) {

                        System.out.print(array[i][j][k] + ", ");
                    }
                }
            }
        }
        System.out.println();
    }
}