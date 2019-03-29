package com.playtika.automation.homework8_collections;

/*
Разработать программу, читающую переданный ей текстовый файл в параметрах.
Программа должна разбить данные текстового файла на слова, посчитать кол-во каждого слова, и вывести слово и кол-во его вхождений в алфавитном порядке (без
учета регистра!).

java ….SomeClass c:\file.txt
в - 10
да - 5
дерево - 2
...
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Collection {

    public static void main(String[] args) {

        try (Scanner reader = new Scanner(new File("c:\\users\\mhorbachov\\desktop\\notes.txt"))) {

            TreeMap<String, Integer> map = new TreeMap<>();

            while (reader.hasNext()) {
                String string = reader.next();

                Integer i = map.get(string);
                if (i == null) {
                    i = 1;
                } else {
                    i = i + 1;
                }
                map.put(string, i);
            }
            for (Map.Entry m : map.entrySet())
                System.out.println(m.getKey() + " - " + m.getValue());

        } catch (FileNotFoundException e) {
            System.err.print("File not found");
        }
    }

}