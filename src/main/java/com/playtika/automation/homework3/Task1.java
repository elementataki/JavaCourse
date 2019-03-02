package com.playtika.automation.homework3;

/*
    Пользователь вводит последовательность символов.
    Программа должна определить, является ли последовательность палиндромом.
    Вывести ДА, если последовательность символов палиндром и НЕТ в противном случае.
*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter symbols: ");

        String symbols = console.nextLine();

        StringBuilder reversedSymbols = new StringBuilder(symbols);

        if (symbols.equals(reversedSymbols.reverse().toString())) {

            System.out.println("Yes. Entered value is a palindrome");

        } else {

            System.out.println("No. Entered value is not a palindrome");

        }
    }
}