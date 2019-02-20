package com.playtika.automation;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String s = console.nextLine();

        System.out.printf("Вы ввели: %s.", s);

    }
}


