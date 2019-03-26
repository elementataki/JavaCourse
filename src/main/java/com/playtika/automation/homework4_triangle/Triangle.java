package com.playtika.automation.homework4_triangle;

import java.text.DecimalFormat;

import static com.playtika.automation.homework4_triangle.TriangleType.ARBITRARY;
import static com.playtika.automation.homework4_triangle.TriangleType.EQUILATERAL;
import static com.playtika.automation.homework4_triangle.TriangleType.ISOSCELES;
import static com.playtika.automation.homework4_triangle.TriangleType.RIGHT;

class Triangle {

    private final float EPSILON = 0.001f;

    private final Point pointA;
    private final Point pointB;
    private final Point pointC;

    private float distanceAB;
    private float distanceBC;
    private float distanceCA;

    Triangle() {

        this.pointA = new Point();
        this.pointB = new Point();
        this.pointC = new Point();

        this.distanceAB = pointA.calculateDistance(pointB);
        this.distanceBC = pointB.calculateDistance(pointC);
        this.distanceCA = pointC.calculateDistance(pointA);
    }


    @Override
    public String toString() {
        return "Triangle [A" + pointA + " B" + pointB + " C" + pointC + "]";
    }


    float calculatePerimeter() {
        return distanceAB + distanceBC + distanceCA;
    }

    float calculateSquare() {
        float halfPerimeter = calculatePerimeter() / 2;
        return (float) Math.sqrt(halfPerimeter * (halfPerimeter - distanceAB) * (halfPerimeter - distanceBC) * (halfPerimeter - distanceCA));
    }


    protected boolean isTriangleEquilateral() {
        return (Math.abs(distanceAB - distanceBC) < EPSILON &&
                Math.abs(distanceBC - distanceCA) < EPSILON &&
                Math.abs(distanceAB - distanceCA) < EPSILON);
    }

    protected boolean isTriangleIsosceles() {
        return (Math.abs(distanceAB - distanceBC) < EPSILON ||
                Math.abs(distanceBC - distanceCA) < EPSILON ||
                Math.abs(distanceAB - distanceCA) < EPSILON);
    }

    protected boolean isTriangleRight() {
        return (Math.abs(distanceAB * distanceAB - distanceBC * distanceBC + distanceCA * distanceCA) < EPSILON ||
                Math.abs(distanceBC * distanceBC - distanceAB * distanceAB + distanceCA * distanceCA) < EPSILON ||
                Math.abs(distanceCA * distanceCA - distanceAB * distanceAB + distanceBC * distanceBC) < EPSILON);
    }


    private TriangleType getTriangleType() {
        if (isTriangleEquilateral()) {
            return EQUILATERAL;
        }
        if (isTriangleIsosceles()) {
            return ISOSCELES;
        }
        if (isTriangleRight()) {
            return RIGHT;
        } else {
            return ARBITRARY;
        }
    }

    protected void getTriangleInfo(int i, Triangle t) {
        switch (getTriangleType()) {
            case EQUILATERAL:
                System.out.println("The equilateral triangle has been found!");
                break;
            case ISOSCELES:
                System.out.println("The isosceles triangle has been found!");
                break;
            case RIGHT:
                System.out.println("The right triangle has been found!");
                break;
            case ARBITRARY:
                System.out.println("The arbitrary triangle has been found!");
                break;
        }
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.printf("Index: %d%n", i);
        System.out.println(t.toString());
        System.out.printf("Perimeter P=%s%n", df.format(t.calculatePerimeter()));
        System.out.printf("Square S=%s%n", df.format(t.calculateSquare()));

        System.out.printf("AB = %s%n", df.format(t.distanceAB));
        System.out.printf("BC = %s%n", df.format(t.distanceBC));
        System.out.printf("CA = %s%n", df.format(t.distanceCA));
    }

    protected boolean isValid() {
        return calculateSquare() != 0;
    }
}