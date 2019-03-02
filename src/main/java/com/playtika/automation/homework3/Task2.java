package com.playtika.automation.homework3;

/*
Пользователь вводит строку.
Программа разбивает строку на слова, и “переворачивает” каждое слово, формирует из новых слов предложение и выводит его на экран.

String[] words = “Sadfsdfs sdfsdf sdfsdf”.split(“ ”);
*/

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String string = console.nextLine();

        String[] stringWords = string.split(" ");


        String reversedString = "";

        for (String i : stringWords) {

            StringBuilder reversedWords = new StringBuilder(i);

            String reversedWord = reversedWords.reverse().toString();

            reversedString = reversedString + reversedWord + " ";
        }

        System.out.printf("Reversed words: %s", reversedString);
    }
}