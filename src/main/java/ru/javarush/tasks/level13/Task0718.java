package ru.javarush.tasks.level13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Сортировка списка
*/

public class Task0718 {
    public static void main(String[] args) throws Exception {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }
        String currentS = list.get(0);
        for (int j = 1; j < list.size(); j++) {
            if (list.get(j).length() >= currentS.length()) {
                currentS = list.get(j);
            } else {
                System.out.println(j);
                break;
            }
        }
    }
}

