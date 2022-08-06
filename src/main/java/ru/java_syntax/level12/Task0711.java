package ru.java_syntax.level12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/*
Удали последнюю строку и вставь её в начало
*/

public class Task0711 {
    public static void main(String[] args) throws Exception {
        String fileName = "src\\main\\resources\\java_test";
        final BufferedReader reader = new BufferedReader(new FileReader(fileName));

        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            stringList.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            stringList.add(0, stringList.remove(stringList.size() - 1));
        }
        stringList.forEach(System.out::println);
    }
}
