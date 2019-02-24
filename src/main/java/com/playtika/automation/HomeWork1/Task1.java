package com.playtika.automation.HomeWork1;

/*
Задание 1.
        Написать программу решающую следующие уравнения. Переменные x,y,z,n инициализируется перед решением уравнения.
        Каждое решение оформить в отдельном статическом методе.
        x - (y + 123) / z * n  		=> считаем в long
        (x + (50 - y * z) / n) - x 	=> считаем в int
        x / (y * (z - 1) - 564) + n 	=> считаем в float
        -x / -y + z / (n + 15) 		=> считаем в double
*/

public class Task1 {

    public static void main(String[] args) {

        long x1 = 1L;
        long y1 = 2L;
        long z1 = 3L;
        long n1 = 5L;

        System.out.println(equation1(x1, y1, z1, n1));


        int x2 = 1;
        int y2 = 2;
        int z2 = 3;
        int n2 = 4;

        System.out.println(equation2(x2, y2, z2, n2));


        float x3 = 1f;
        float y3 = 2f;
        float z3 = 3f;
        float n3 = 4f;

        System.out.println(equation3(x3, y3, z3, n3));


        double x4 = 1d;
        double y4 = 2d;
        double z4 = 3d;
        double n4 = 4d;

        System.out.println(equation4(x4, y4, z4, n4));
    }

    private static long equation1(long x, long y, long z, long n) {
        return x - (y + 123) / z * n;
    }

    private static int equation2(int x, int y, int z, int n) {
        return (x + (50 - y * z) / n) - x;
    }

    private static float equation3(float x, float y, float z, float n) {
        return x / (y * (z - 1) - 564) + n;
    }

    private static double equation4(double x, double y, double z, double n) {
        return -x / -y + z / (n + 15);
    }

}