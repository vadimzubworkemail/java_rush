package ru.java_syntax.level12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая короткая строка
*/

public class Task0709 {
    public static void main(String[] args) throws Exception {
        final BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        final ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(bufferedReader.readLine());
        }
        int min = Integer.MAX_VALUE;
        for (String s : list) {
            if (s.length() < min) {
                min = s.length();
            }
        }
        for (String s1 : list) {
            if (min == s1.length()) {
                System.out.println(s1);
            }
        }
    }
}

