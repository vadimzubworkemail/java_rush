package ru.javarush.syntax.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Строка - описание

Введи с клавиатуры целое число в диапазоне 1 - 999. Выведи его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру;
«нечетное однозначное число» - если число нечетное и имеет одну цифру;
«четное двузначное число» - если число четное и имеет две цифры;
«нечетное двузначное число» - если число нечетное и имеет две цифры;
«четное трехзначное число» - если число четное и имеет три цифры;
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, не нужно ничего выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/
public class Task0427 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String message = "что-то пошло не так :(";

        if (number >= 1 && number < 10 && number % 2 == 0) {
            message = "четное однозначное число";
        } else if (number >= 1 && number < 10 && number % 2 != 0) {
            message = "нечетное однозначное число";
        } else if (number >= 10 && number < 100 && number % 2 == 0) {
            message = "четное двузначное число";
        } else if (number >= 10 && number < 100 && number % 2 != 0) {
            message = "нечетное двузначное число";
        } else if (number >= 100 && number < 1000 && number % 2 == 0) {
            message = "четное трехзначное число";
        } else if (number >= 100 && number < 1000 && number % 2 != 0) {
            message = "нечетное трехзначное число";
        }
        System.out.println(message);
    }
}
