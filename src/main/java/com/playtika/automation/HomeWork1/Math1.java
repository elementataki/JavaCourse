package com.playtika.automation.HomeWork1;

// Math.sqrt((a + b) * (c + d - e))

        import static java.lang.Math.sqrt;

public class Math1 {

    public static void main(String[] args) {

        int a = 1;
        int b = 7;
        int c = 25;
        int d = 3;
        int e = -11;

        int n = multiplication(addition(a, b), subtraction(addition(d, c), e));

        System.out.println(squareRoot(n));
    }

    private static int addition (int x, int y) {
        return x + y;
    }

    private static int subtraction (int x, int y) {
        return x - y;
    }

    private static  int multiplication (int x, int y) {
        return x * y;
    }

    private static double squareRoot (double x) {
        return sqrt(x);
    }
}