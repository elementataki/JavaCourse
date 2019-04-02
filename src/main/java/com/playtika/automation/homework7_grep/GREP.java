package com.playtika.automation.homework7_grep;

/*
Разработать программу, аналог GREP :).
Программа ожидает 2 параметра на входе:
1. имя файла (относительное либо полный путь)
2. строку/регулярное выражение
После программа выводит все строки (с номером строки в файле), в которых найдена строка либо регулярное выражение.

Если файл не найден, либо доступ к нему запрещен, программа выводит соответствующее сообщение.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class GREP {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter path to the file: ");
        String path = console.nextLine();
        System.out.print("Enter GREP: ");
        String grep = console.nextLine();

        Pattern pattern = Pattern.compile(grep);

        try (Scanner reader = new Scanner(new File(path))) {

            int line = 1;

            while (reader.hasNextLine()) {
                String string = reader.nextLine();

                if (pattern.matcher(string).find()) {
                    System.out.println(line + "  " + string);
                }

                line++;
            }

        } catch (FileNotFoundException e) {
            System.err.print("File not found");
        }
    }

}