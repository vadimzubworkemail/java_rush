package ru.javarush.tasks.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Строка - описание
Введи с клавиатуры целое число. Выведи на экран его строку-описание следующего вида:

«отрицательное четное число» - если число отрицательное и четное;
«отрицательное нечетное число» - если число отрицательное и нечетное;
«ноль» - если число равно 0;
«положительное четное число» - если число положительное и четное;
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/
public class Task0426 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String message = "что-то пошло не так :(";

        if (number < 0 && number % 2 == 0){
            message = "отрицательное четное число";
        }
        if (number < 0 && number % 2 != 0){
            message = "отрицательное нечетное число";
        }
        if (number > 0 && number % 2 == 0){
            message = "положительное четное число";
        }
        if (number > 0 && number % 2 != 0){
            message = "положительное нечетное число";
        }
        if (number == 0){
            message = "ноль";
        }
        System.out.println(message);
    }
}

