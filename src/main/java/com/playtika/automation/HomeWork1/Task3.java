package com.playtika.automation.HomeWork1;

/*
Задание 3.
        Напишите программу, которая для 3-х координат вектора x, y, и z, с основанием у начала координат вычисляет единичный вектор и выводит его на консоль.
        Для нахождения единичного вектора, нужно посчитать длину исходного вектора и разделить каждую из координат на его длину.
        Длина вектора - Math.sqrt(X * X + Y * Y + Z * Z)

        Пример:
        Единичный вектор для вектора (5, 0, 0) => (1, 0, 0)
*/

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Enter X coordinate and press Enter button");
        Scanner consoleX = new Scanner(System.in);
        double x = consoleX.nextDouble();

        System.out.println("Enter Y coordinate and press Enter button");
        Scanner consoleY = new Scanner(System.in);
        double y = consoleY.nextDouble();

        System.out.println("Enter Z coordinate and press Enter button");
        Scanner consoleZ = new Scanner(System.in);
        double z = consoleZ.nextDouble();

        double vectorLength = vector(x, y, z);

        unitVector(x,y,z,vectorLength);
    }

    private static double vector(double x, double y, double z) {
        return java.lang.Math.sqrt(x * x + y * y + z * z);
    }

    private static void unitVector(double x, double y, double z, double vectorLength) {

        double unitVectorX = x / vectorLength;
        double unitVectorY = y / vectorLength;
        double unitVectorZ = z / vectorLength;

        System.out.printf("Единичный вектор для вектора (%f, %f, %f) => (%f, %f, %f)", x, y, z, unitVectorX, unitVectorY, unitVectorZ);
    }
}
