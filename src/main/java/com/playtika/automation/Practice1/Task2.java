package com.playtika.automation.Practice1;

// Пользователь вводит время в минутах и расстояние в километрах. Найдите скорость в м/c.

import java.util.Scanner;

import static com.playtika.automation.Practice1.Task1.df2;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Enter the time value in min:");
        Scanner time = new Scanner(System.in);
        double t = time.nextDouble();

        System.out.println("Enter the distance value in km:");
        Scanner distance = new Scanner(System.in);
        double s = distance.nextDouble();

        System.out.printf("Speed value is: %s m/sec %n" , df2.format(kmToM(s)/minToSec(t)));

    }

    private static double minToSec (double t) {
        return t * 60;
    }

    private static double kmToM (double s) {
        return s * 1000;
    }

}