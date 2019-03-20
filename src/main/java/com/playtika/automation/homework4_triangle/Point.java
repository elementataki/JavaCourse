package com.playtika.automation.homework4_triangle;

import java.util.concurrent.ThreadLocalRandom;

class Point {

    private static final float MAX_VALUE = 2f;
    private final float SCALE = 100;

    float x;
    float y;

    Point() {
        this.x = Math.round(ThreadLocalRandom.current().nextFloat() * MAX_VALUE * SCALE) / SCALE;
        this.y = Math.round(ThreadLocalRandom.current().nextFloat() * MAX_VALUE * SCALE) / SCALE;
    }

    float calculateDistance(Point pointTo) {
        float dx = x - pointTo.x;
        float dy = y - pointTo.y;
        float distance = (float) Math.sqrt(dx * dx + dy * dy);
        return distance;
    }

    @Override
    public String toString() {
        return ("(" + x + ";" + y + ")");
    }
}