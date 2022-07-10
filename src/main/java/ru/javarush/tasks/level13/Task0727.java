package ru.javarush.tasks.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Нужно заменить функциональность программы
*/

public class Task0727 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.length() % 2 == 0) {
                resultStrings.add(string.concat(" " + string));
            } else {
                resultStrings.add(string.concat(" " + string + " " + string));
            }
        }

        for (String resultString : resultStrings) {
            System.out.println(resultString);
        }
    }
}
