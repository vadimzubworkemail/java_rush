package ru.java_syntax.level12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Считай с клавиатуры 5 чисел и добавь в список integers.
Найди максимальное число в списке.
Выведи найденное число на экран.
 */
public class TheLargestNumber {

    private static final ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            integers.add(Integer.parseInt(bufferedReader.readLine()));
        }
        int max = Integer.MIN_VALUE;
        for (Integer integer : integers) {
            max = Math.max(max, integer);
            System.out.println(max);
        }
    }
}
