package com.playtika.automation.homework4;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");

        final int TRIANGLE_QUANTITY = 100;
        final int MAX_VALUE = 10;

        float[] xA = new float[TRIANGLE_QUANTITY];
        for (int i = 0; i < TRIANGLE_QUANTITY; i++) {
            xA[i] = ThreadLocalRandom.current().nextInt(MAX_VALUE);
        }

        float[] yA = new float[TRIANGLE_QUANTITY];
        for (int i = 0; i < TRIANGLE_QUANTITY; i++) {
            yA[i] = ThreadLocalRandom.current().nextInt(MAX_VALUE);
        }
        System.out.printf("xA = %s%n", Arrays.toString(xA));
        System.out.printf("yA = %s%n", Arrays.toString(yA));

        float[] xB = new float[TRIANGLE_QUANTITY];
        for (int i = 0; i < TRIANGLE_QUANTITY; i++) {
            xB[i] = ThreadLocalRandom.current().nextInt(MAX_VALUE);
        }

        float[] yB = new float[TRIANGLE_QUANTITY];
        for (int i = 0; i < TRIANGLE_QUANTITY; i++) {
            yB[i] = ThreadLocalRandom.current().nextInt(MAX_VALUE);
        }
        System.out.printf("xB = %s%n", Arrays.toString(xB));
        System.out.printf("yB = %s%n", Arrays.toString(yB));

        float[] xC = new float[TRIANGLE_QUANTITY];
        for (int i = 0; i < TRIANGLE_QUANTITY; i++) {
            xC[i] = ThreadLocalRandom.current().nextInt(MAX_VALUE);
        }

        float[] yC = new float[TRIANGLE_QUANTITY];
        for (int i = 0; i < TRIANGLE_QUANTITY; i++) {
            yC[i] = ThreadLocalRandom.current().nextInt(MAX_VALUE);
        }
        System.out.printf("xC = %s%n", Arrays.toString(xC));
        System.out.printf("yC = %s%n", Arrays.toString(yC));

        System.out.printf("%d triangles are being generating...%n", TRIANGLE_QUANTITY);

        System.out.println();

        System.out.printf("Choose triangle type:%n" +
                                  "1. Isosceles triangle%n" +
                                  "2. Equilateral triangle%n" +
                                  "3. Right triangle%n" +
                                  "4. Arbitrary triangle%n");

        Scanner console = new Scanner(System.in);
        int requiredTriangle = console.nextInt();

        System.out.println();

        for (int i = 0; i < TRIANGLE_QUANTITY; i++) {

            Point pointA = new Point(xA[i], yA[i]);
            Point pointB = new Point(xB[i], yB[i]);
            Point pointC = new Point(xC[i], yC[i]);

            Triangle triangle = new Triangle(pointA, pointB, pointC);

            if (requiredTriangle == 1 && triangle.determineTriangleType().equals("Triangle is isosceles")) {
                System.out.println("The isosceles triangle has been found!");
                System.out.printf("Index: %d%n", i);
                System.out.printf("Triangle [A(%s;%s) B(%s;%s) C(%s;%s)]%n", xA[i], yA[i], xB[i], yB[i], xC[i], yC[i]);
                System.out.printf("Perimeter P=%s%n", df.format(triangle.calculatePerimeter()));
                System.out.printf("Square S=%s%n", df.format(triangle.calculateSquare()));
                break;
            }

            if (requiredTriangle == 2 && triangle.determineTriangleType().equals("Triangle is equilateral")) {
                System.out.println("The equilateral triangle has been found!");
                System.out.printf("Index: %d%n", i);
                System.out.printf("Triangle [A(%s;%s) B(%s;%s) C(%s;%s)]%n", xA[i], yA[i], xB[i], yB[i], xC[i], yC[i]);
                System.out.printf("Perimeter P=%s%n", df.format(triangle.calculatePerimeter()));
                System.out.printf("Square S=%s%n", df.format(triangle.calculateSquare()));
                break;
            }

            if (requiredTriangle == 3 && triangle.determineTriangleType().equals("Triangle is right")) {
                System.out.println("The right triangle has been found!");
                System.out.printf("Index: %d%n", i);
                System.out.printf("Triangle [A(%s;%s) B(%s;%s) C(%s;%s)]%n", xA[i], yA[i], xB[i], yB[i], xC[i], yC[i]);
                System.out.printf("Perimeter P=%s%n", df.format(triangle.calculatePerimeter()));
                System.out.printf("Square S=%s%n", df.format(triangle.calculateSquare()));
                break;
            }

            if (requiredTriangle == 4 && triangle.determineTriangleType().equals("Triangle is arbitrary")) {
                System.out.println("The arbitrary triangle has been found!");
                System.out.printf("Index: %d%n", i);
                System.out.printf("Triangle [A(%s;%s) B(%s;%s) C(%s;%s)]%n", xA[i], yA[i], xB[i], yB[i], xC[i], yC[i]);
                System.out.printf("Perimeter P=%s%n", df.format(triangle.calculatePerimeter()));
                System.out.printf("Square S=%s%n", df.format(triangle.calculateSquare()));
                break;
            }



//            System.out.println(df.format(triangle.distanceAB));
//            System.out.println(df.format(triangle.distanceBC));
//            System.out.println(df.format(triangle.distanceCA));
//            System.out.println(df.format(triangle.calculatePerimeter()));
//
//            System.out.println(df.format(triangle.calculateSquare()));
//
//            System.out.println(triangle.determineTriangleType());
        }
    }
}
