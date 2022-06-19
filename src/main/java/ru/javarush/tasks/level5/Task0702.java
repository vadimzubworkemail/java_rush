package ru.javarush.tasks.level5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из строк в обратном порядке
Создать массив на 10 строк.
Ввести с клавиатуры 8 строк и сохранить их в массив.
Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент — с новой строки.
*/
public class Task0702 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];
        for (int i = 0; i < 8; i++) {
            strings[i] = reader.readLine();
        }
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.println(strings[i]);
        }
    }
}
