package ru.javarush.syntax.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Все любят Мамбу

Введи с клавиатуры имя и, используя цикл for, 10 раз выведи: <имя> любит меня.
Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
*/
public class Task0439 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        for (int i = 1; i <= 10; i++){
            System.out.println(s + " любит меня.");
        }
    }
}
