package ru.javarush.tasks.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Два массива
Создать массив на 10 строк.
Создать массив на 10 чисел.
Ввести с клавиатуры 10 строк, заполнить ими массив строк.
В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Task0703 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[10];
        int[] ints = new int[10];

        for (int i = 0; i < str.length; i++) {
            str[i] = reader.readLine();
        }
        for (int i = 0; i < str.length; i++) {
            ints[i] = str[i].length();
            System.out.println(ints[i]);
        }
    }
}
