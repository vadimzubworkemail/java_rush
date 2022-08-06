package ru.java_syntax.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Минимум двух чисел
Введи с клавиатуры два целых числа и выведи на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.
*/
public class Task0418 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int min;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
        System.out.println(min);
    }
}
