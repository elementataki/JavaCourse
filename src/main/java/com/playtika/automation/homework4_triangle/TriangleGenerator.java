package com.playtika.automation.homework4_triangle;

public class TriangleGenerator {

    protected Triangle generateTriangle() {

        Triangle triangle = new Triangle();

        if (triangle.isValid()) {
            return triangle;
        }

        return generateTriangle();
    }
}