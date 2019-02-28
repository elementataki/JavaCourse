package com.playtika.automation.HomeWork2;

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

        System.out.println("Choose the cell size: 3, 6 or 9");
        Scanner cell = new Scanner(System.in);
        int cellSize = cell.nextInt();

        //finding the length of solid line

        int solidLine = 5 + 4 * cellSize;

        //printing of the first line

        for (int i = 1; i <= solidLine; i++) {
            System.out.print("*");
        }

        System.out.println();

        //loop for printing blocks in vertical direction

        for (int j = 1; j <= 4; j++) {

            //loop for printing the quantity of lines in each block

            for (int k = 1; k <= (cellSize / 3); k++) {

                //conditions for printing blocks in horizontal direction

                if (cellSize == 3) {

                    for (int i = 1; i <= 4; i++) {
                        System.out.print("*   ");
                    }
                }
                if (cellSize == 6) {

                    for (int i = 1; i <= 4; i++) {
                        System.out.print("*      ");
                    }
                }
                if (cellSize == 9) {

                    for (int i = 1; i <= 4; i++) {
                        System.out.print("*         ");
                    }
                }

                System.out.println("*");
            }

            //solid line under the each block

            for (int i = 1; i <= solidLine; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
