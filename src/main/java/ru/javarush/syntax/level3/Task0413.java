package ru.javarush.syntax.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
День недели

Введи с клавиатуры номер дня недели. Далее, в зависимости от номера, выведи одно из названий: «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье».
Если введен номер больше 7 или меньше 1, выведи «такого дня недели не существует».

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует
*/
public class Task0413 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());
        String result = "«такого дня недели не существует»";

        if (day == 1) {
            result = "понедельник";
        }
        if (day == 2) {
            result = "вторник";
        }
        if (day == 3) {
            result = "среда";
        }
        if (day == 4) {
            result = "четверг";
        }
        if (day == 5) {
            result = "пятница";
        }
        if (day == 6) {
            result = "суббота";
        }
        if (day == 7) {
            result = "воскресенье";
        }

        System.out.println(result);
    }
}

