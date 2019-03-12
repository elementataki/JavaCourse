package com.playtika.automation.homework4;

import java.text.DecimalFormat;

public class Triangle {

    public final Point pointA;
    public final Point pointB;
    public final Point pointC;

    public float distanceAB;
    public float distanceBC;
    public float distanceCA;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;

        this.distanceAB = pointA.calculateDistance(pointB);
        this.distanceBC = pointB.calculateDistance(pointC);
        this.distanceCA = pointC.calculateDistance(pointA);
    }

    public float calculatePerimeter() {
        return distanceAB + distanceBC + distanceCA;
    }

    public float calculateSquare() {
        float halfPerimeter = calculatePerimeter() / 2;
        return (float) Math.sqrt(halfPerimeter * (halfPerimeter - distanceAB) * (halfPerimeter - distanceBC) * (halfPerimeter - distanceCA));
    }

    public String determineTriangleType() {

        DecimalFormat df = new DecimalFormat("#.#####");

        if (df.format(distanceAB).equals(df.format(distanceBC)) ||
                df.format(distanceBC).equals(df.format(distanceCA)) ||
                df.format(distanceAB).equals(df.format(distanceCA))) {
            return "Triangle is isosceles";
        } else if (df.format(distanceAB).equals(df.format(distanceBC)) &&
                df.format(distanceBC).equals(df.format(distanceCA)) &&
                df.format(distanceAB).equals(df.format(distanceCA))) {
            return "Triangle is equilateral";
        } else if (df.format(distanceAB * distanceAB)
                     .equals(df.format(distanceBC * distanceBC + distanceCA * distanceCA)) ||
                df.format(distanceBC * distanceBC)
                  .equals(df.format(distanceAB * distanceAB + distanceCA * distanceCA)) ||
                df.format(distanceCA * distanceCA)
                  .equals(df.format(distanceAB * distanceAB + distanceBC * distanceBC))) {
            return "Triangle is right";
        } else {
            return "Triangle is arbitrary";
        }
    }
}