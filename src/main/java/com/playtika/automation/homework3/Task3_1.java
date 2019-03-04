package com.playtika.automation.homework3;

/*
Пользователь задает длину массива (положительное число от 10 до 100).
Программа заполняет массив случайными числами. Выводит массив и все числа массива кратные 3-ем.

ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task3_1 {

    public static void main(String[] args) {

        final int MAX_VALUE = 999;

        Scanner console = new Scanner(System.in);
        System.out.print("Enter an array size: ");
        int arraySize = console.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {

            array[i] = ThreadLocalRandom.current().nextInt(MAX_VALUE);
        }
        System.out.printf("Array = %s%n", Arrays.toString(array));

        System.out.print("Array contains the following numbers which are multiplies of 3: ");

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 3 == 0) {

                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}