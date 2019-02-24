package com.playtika.automation.Practice1;

/*
Пользователь вводит цены 1 кг конфет и 1 кг печенья. Найдите стоимость:
        а) одной покупки из 300 г конфет и 400 г печенья;
        б) трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Enter the quantity of purchases: ");
        Scanner quantity = new Scanner(System.in);

        int q = quantity.nextInt();

        System.out.println("Enter the price in uah of 1 kg of candies: ");
        Scanner candyPrice = new Scanner(System.in);
        double cp = candyPrice.nextDouble();

        System.out.println("Enter the price in uah of 1 kg of cookies: ");
        Scanner cookiePrice = new Scanner(System.in);
        double kp = cookiePrice.nextDouble();

        System.out.println("Enter weight of candies in kg: ");
        Scanner candyWeight = new Scanner(System.in);
        double cw = candyWeight.nextDouble();

        System.out.println("Enter weight of cookies in kg: ");
        Scanner cookieWeight = new Scanner(System.in);
        double kw = cookieWeight.nextDouble();

        double pp = purchase(cp, cw) + purchase(kp, kw);

        if (q == 1) {System.out.printf("Purchase price of %s kg of candies and %s kg of cookies is %s uah.%n%n", df2.format(cw), df2.format(kw),
                                      df2.format(pp));
        }
        else if (q > 1) {
            System.out.printf("Price for %d purchases each of which consists of %s kg of candies and %s kg of cookies is %s uah.%n", q, df2.format(cw),
                              df2.format(kw), df2.format(q * pp));
        }
        else {
            System.out.println("Enter the positive quantity of purchases");
        }
    }

    private static double purchase(double x, double y) {
        return x * y;
    }

    public static DecimalFormat df2 = new DecimalFormat("#.##");

}