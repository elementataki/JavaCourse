package com.playtika.automation.practice1;

/*
Пользователь вводит цены 1 кг конфет и 1 кг печенья. Найдите стоимость:
        а) одной покупки из 300 г конфет и 400 г печенья;
        б) трех покупок, каждая из 2 кг печенья и 1 кг 800 г конфет.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {

    public static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {

        Scanner enterValue = new Scanner(System.in);

        System.out.println("Enter the quantity of purchases: ");
        int purchaseQuantity = enterValue.nextInt();

        System.out.println("Enter the price in uah of 1 kg of candies: ");
        double candyPrice = enterValue.nextDouble();

        System.out.println("Enter the price in uah of 1 kg of cookies: ");
        double cookiePrice = enterValue.nextDouble();

        System.out.println("Enter weight of candies in kg: ");
        double candyWeight = enterValue.nextDouble();

        System.out.println("Enter weight of cookies in kg: ");
        double cookieWeight = enterValue.nextDouble();

        double purchasePrice = calculateItemCost(candyPrice, candyWeight) + calculateItemCost(cookiePrice, cookieWeight);

        if (purchaseQuantity == 1) {
            System.out.printf("Purchase price of %s kg of candies and %s kg of cookies is %s uah.%n%n",
                              df2.format(candyWeight), df2.format(cookieWeight), df2.format(purchasePrice));
        } else if (purchaseQuantity > 1) {
            System.out.printf("Price for %d purchases each of which consists of %s kg of candies and %s kg of cookies is %s uah.%n",
                              purchaseQuantity, df2.format(candyWeight), df2.format(cookieWeight), df2.format(purchaseQuantity * purchasePrice));
        } else {
            System.out.println("Enter the positive quantity of purchases");
        }
    }

    private static double calculateItemCost(double itemPrice, double itemWeight) {
        return itemPrice * itemWeight;
    }
}