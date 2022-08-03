package ru.javarush.syntax.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из чисел в обратном порядке
Создать массив на 10 чисел.
Ввести с клавиатуры 10 чисел и записать их в массив.
Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
*/
public class Task0704 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.println(ints[i]);
        }
    }
}
