package ru.javarush.syntax.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Хорошего не бывает много

Введи с клавиатуры строку и число N больше 0.
Выведи на экран строку N раз, используя цикл while.
Каждое значение - с новой строки.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/
public class Task0432 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int i = Integer.parseInt(reader.readLine());

        while (i > 0){
            System.out.println(s);
            i--;
        }
    }
}
