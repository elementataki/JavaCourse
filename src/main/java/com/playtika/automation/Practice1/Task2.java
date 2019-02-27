package com.playtika.automation.Practice1;

// Пользователь вводит время в минутах и расстояние в километрах. Найдите скорость в м/c.

import java.util.Scanner;

import static com.playtika.automation.Practice1.Task1.df2;

public class Task2 {

    public static void main(String[] args) {

        Scanner enterValue = new Scanner(System.in);

        System.out.println("Enter the time value in min:");
        double timeInMin = enterValue.nextDouble();

        System.out.println("Enter the distance value in km:");
        double distanceInKm = enterValue.nextDouble();

        System.out.printf("Speed value is: %s m/sec %n", df2.format(kmToM(distanceInKm) / minToSec(timeInMin)));
    }

    private static double minToSec(double timeInMin) {
        return timeInMin * 60;
    }

    private static double kmToM(double distanceInKm) {
        return distanceInKm * 1000;
    }

}

