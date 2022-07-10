package ru.javarush.tasks.level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Максимальное и минимальное числа в массиве
*/

public class Task0721 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[20];

        for (int i = 0; i < ints.length; i++) {
            int parseInt = Integer.parseInt(reader.readLine());
            ints[i] = parseInt;
        }
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int anInt : ints) {
            if (anInt > maximum) {
                maximum = anInt;
            }
            if (anInt < minimum) {
                minimum = anInt;
            }
        }
        System.out.println(maximum + " " + minimum);
    }
}
