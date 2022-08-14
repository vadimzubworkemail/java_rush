package ru.java_core.level13;

/*
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task1326 {
    public static void main(String[] args) {
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             final Scanner scanner = new Scanner(new FileInputStream(reader.readLine()))) {

            final List<Integer> list = new ArrayList<>();
            while (scanner.hasNextInt()) {
                int someNum = scanner.nextInt();
                if (someNum % 2 == 0) list.add(someNum);
            }
            Collections.sort(list);
            list.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
