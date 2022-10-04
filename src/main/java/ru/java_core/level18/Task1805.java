package ru.java_core.level18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/*
Сортировка байт
*/

public class Task1805 {
    public static void main(String[] args) throws Exception {
        Set<Integer> set = new TreeSet<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream stream = new FileInputStream(reader.readLine())) {
            while (stream.available() > 0) set.add(stream.read());
        }
        for (Integer integer : set)
            System.out.print(integer + " ");
    }
}
