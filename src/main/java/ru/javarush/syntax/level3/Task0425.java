package ru.javarush.syntax.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Координатные четверти

Введи с клавиатуры два целых числа, которые будут координатами точки, не лежащей на осях OX и OY.
Выведи на экран номер координатной четверти, в которой находится данная точка.

Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:

для первой четверти - a>0 и b>0;
для второй четверти - a<0 и b>0;
для третьей четверти - a<0 и b<0;
для четвертой четверти - a>0 и b<0.
Пример для чисел 4 6:
1
Пример для чисел -6 -6:
3
*/
public class Task0425 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        String result = "result";

        if (a > 0 && b > 0) {
            result = "1";
        }
        if (a < 0 && b > 0) {
            result = "2";
        }
        if (a < 0 && b < 0){
            result = "3";
        }
        if (a> 0 && b<0){
            result = "4";
        }
        System.out.println(result);
    }
}
