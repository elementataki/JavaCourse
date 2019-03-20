package com.playtika.automation.homework4_triangle;

/*
Создать класс Point, который задает координаты в двумерном пространстве. Определить метод для расчета расстояния от текущей точки до указанной.
Point {
float x;
float y;

float distance(Point pointTo)*;
}

*Для расчета дистанции нужно вычесть из одной точки другую и посчитать длину полученного вектора: (x1 - x2; y1 - y2) => sqrt(x’ ^ 2 + y’ ^ 2)

Создать класс Triangle, точки которого заданы классом Point. Определить методы для расчета периметра и площади треугольника. А также метод классификации
треугольника (равнобедренный, равносторонний, прямоугольный, произвольный).
Triangle {
Point a;
Point b;
Point c;

float perimeter();
float square();
String type();
}

Сгенерировать массив случайных треугольников. (100 000)
Найти первый попавшийся в массиве треугольник, заданного пользователем класса, вывести в консоль информацию о треугольнике, его периметр и площадь. Если
треугольник не найден, сообщить об этом пользователю.

Генерация 100000 треугольников…

Выберите класс треугольника для поиска:
1. Равносторонний
2. Равнобедренный
3. Прямоугольный
4. Произвольный

Найден равносторонний треугольник.
Индекс: 10
Треугольник[a(1;3) b(4;8) c(7;3)]
Периметр: 18
Площадь: 15

Дополнительно по желанию.
Подсчитать количество каждого из классов треугольников и вывести в консоль.
*/

import java.util.Scanner;

public class TriangleFinder {

    public static void main(String[] args) {

        final int TRIANGLE_QUANTITY = 1_000_000;

        System.out.printf("Choose triangle type:%n" +
                                  "1. Equilateral triangle%n" +
                                  "2. Isosceles triangle%n" +
                                  "3. Right triangle%n" +
                                  "4. Arbitrary triangle%n");

        Scanner console = new Scanner(System.in);
        int requiredTriangle = console.nextInt();

        System.out.println();

        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        int t4 = 0;

        boolean notPrinted = true;

        TriangleGenerator tg = new TriangleGenerator();

        System.out.printf("%d triangles are being generating...%n", TRIANGLE_QUANTITY);

        System.out.println();

        for (int i = 0; i < TRIANGLE_QUANTITY; i++) {

            Triangle t = tg.generateTriangle();

            if (t.isTriangleEquilateral()) {
                t1++;
                if (requiredTriangle == 1 && notPrinted) {
                    t.triangleInfo(i, t);
                    notPrinted = false;
                }
                continue;
            }

            if (t.isTriangleIsosceles()) {
                t2++;
                if (requiredTriangle == 2 && notPrinted) {
                    t.triangleInfo(i, t);
                    notPrinted = false;
                }
                continue;
            }

            if (t.isTriangleRight()) {
                t3++;
                if (requiredTriangle == 3 && notPrinted) {
                    t.triangleInfo(i, t);
                    notPrinted = false;
                }
            }

            if (!(t.isTriangleEquilateral()) && !(t.isTriangleIsosceles()) && !(t.isTriangleRight())) {
                t4++;
                if (requiredTriangle == 4 && notPrinted) {
                    t.triangleInfo(i, t);
                    notPrinted = false;
                }
            }
        }

        if (requiredTriangle == 1 && t1 == 0) {
            System.out.println("There is no an equilateral triangle");
        }

        if (requiredTriangle == 2 && t2 == 0) {
            System.out.println("There is no an isosceles triangle");
        }

        if (requiredTriangle == 3 && t3 == 0) {
            System.out.println("There is no a right triangle");
        }

        System.out.println();
        System.out.printf("The quantity of equilateral triangles is: %s%n", t1);
        System.out.printf("The quantity of isosceles triangles is: %s%n", t2);
        System.out.printf("The quantity of right triangles is: %s%n", t3);
        System.out.printf("The quantity of arbitrary triangles is: %s%n", t4);
        System.out.printf("Total quantity of triangles is: %s%n", t1 + t2 + t3 + t4);
    }
}