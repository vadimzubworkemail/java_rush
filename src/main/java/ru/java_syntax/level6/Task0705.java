package ru.java_syntax.level6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
Создать массив на 20 чисел.
Ввести в него значения с клавиатуры.
Создать два массива на 10 чисел каждый.
Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
public class Task0705 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[20];
        int[] ints1 = new int[10];
        int[] ints2 = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        System.arraycopy(ints, 0, ints1, 0, ints1.length);
        System.arraycopy(ints, 10, ints2, 0, ints2.length);
        for (int i = 0; i < ints2.length; i++) {
            System.out.println(ints2[i]);
        }
    }
}


