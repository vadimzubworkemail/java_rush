package ru.javarush.syntax.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Среднее такое среднее

Введи с клавиатуры три числа, выведи на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, выведи любое из них.
*/
public class Task0441 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a <= b && a >= c || a >= b && a <= c) {
            System.out.println(a);
        }
        if (b < a && b >= c || b > a && b <= c) {
            System.out.println(b);
        }
        if (c > a && c < b || c < a && c > b){
            System.out.println(c);
        }

    }
}
