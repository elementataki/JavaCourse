package com.playtika.automation.homework2;

/*
Напишите программу, которая строит “сетку” 4 х 4:

        *****************
        *   *   *   *   *
        *****************
        *   *   *   *   *
        *****************
        *   *   *   *   *
        *****************
        *   *   *   *   *
        *****************
        Ширина определяемая пробелами, вводится пользователем с шагом 3. Минимальная ширина составляет 3 пробела, максимальная 9.
        Количество строк высоты определяется как ширина деленная на 3.
*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Enter the cell width which is a multiple of three");
        Scanner enterValue = new Scanner(System.in);
        int cellWidth = enterValue.nextInt();

        final int CELLS_QUANTITY = 4;
        final int QUANTITY_OF_SEPARATORS_BETWEEN_CELLS = 5;
        final int MULTIPLIER_OF_ROWS_QUANTITY = 3;

        int solidLineSize = CELLS_QUANTITY * cellWidth + QUANTITY_OF_SEPARATORS_BETWEEN_CELLS;

        if (cellWidth % 3 == 0) {

            printSolidLine(solidLineSize);

            for (int j = 1; j <= CELLS_QUANTITY; j++) {

                for (int k = 1; k <= (cellWidth / MULTIPLIER_OF_ROWS_QUANTITY); k++) {

                    printCellString(cellWidth, CELLS_QUANTITY);
                }
                printSolidLine(solidLineSize);
            }
        } else {
            System.out.println("Invalid data. Please re-run the program and try again");
        }
    }

    private static void printSolidLine(int solidLineSize) {
        for (int i = 1; i <= solidLineSize; i++) {
            System.out.print("*");
        }

        System.out.println();
    }

    private static void printCellString(int cellWidth, int cellsQuantity) {

        for (int i = 1; i <= cellsQuantity; i++) {

            System.out.print("*");
            for (int j = 1; j <= cellWidth; j++) {
                System.out.print(" ");
            }
        }
        System.out.println("*");
    }
}