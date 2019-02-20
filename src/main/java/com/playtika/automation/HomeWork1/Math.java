package com.playtika.automation.HomeWork1;

public class Math {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        int c = addition(a, b);
        printInt(c);

//        System.out.println(c);

        int d = 5;
        int e = 3;

        int f = subtraction(d, e);
        printInt(f);

//        System.out.println(f);

        long g = 11;
        long h = 25;

        long i = multiplication(g, h);
        printLong(i);

//        System.out.println(i);

        double j = 111;
        double k = 7;

        double l = division(j, k);
        printDouble(l);

//        System.out.println(l);

    }

    private static int addition(int x, int y) {
        return x + y;
    }

    private static int subtraction(int x, int y) {
        return x - y;
    }

    private static long multiplication(long x, long y) {
        return x * y;
    }

    private static double division(double x, double y) {
        return x / y;
    }

    private static void printInt(int a) {
        System.out.println(a);
    }

    private static void printLong(long b) {
        System.out.println(b);
    }

    private static void printDouble(double c) {
        System.out.println(c);
    }

}
