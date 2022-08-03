package ru.javarush.syntax.level16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/*
Задача по алгоритмам
*/

public class Task0930 {

    public static ArraySorter arraySorter = new ArraySorter();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Vadim Zub\\Desktop\\Java_test.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        arraySorter.sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }
}
