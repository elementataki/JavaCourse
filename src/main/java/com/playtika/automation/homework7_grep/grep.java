package com.playtika.automation.homework7_grep;

/*
Разработать программу, аналог grep :).
Программа ожидает 2 параметра на входе:
1. имя файла (относительное либо полный путь)
2. строку/регулярное выражение
После программа выводит все строки (с номером строки в файле), в которых найдена строка либо регулярное выражение.

Если файл не найден, либо доступ к нему запрещен, программа выводит соответствующее сообщение.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class grep {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter path to the file: ");
        String path = console.nextLine();
        System.out.print("Enter grep: ");
        String grep = console.nextLine();

        try {
            File file = new File(path);
            Scanner reader = new Scanner(file);
            int line = 1;

            while (reader.hasNextLine()) {
                String string = reader.nextLine();

                if (string.contains(grep)) {
                    System.out.println(line + "  " + string);
                }

                line++;
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.err.print("File not found");
        }
    }

}