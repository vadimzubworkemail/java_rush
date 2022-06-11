package ru.javarush.tasks.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительные и отрицательные числа
Введи с клавиатуры три целых числа. Выведи на экран количество положительных и отрицательных чисел в исходном наборе в следующем виде:
"количество отрицательных чисел: а"
"количество положительных чисел: б"
где а, б - искомые значения.

Примеры:
а) при вводе чисел:
2
5
6
получим вывод:
количество отрицательных чисел: 0
количество положительных чисел: 3

б) при вводе чисел:
-2
-5
6
получим вывод:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/
public class Task0429 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int posCount = 0;
        int negCount = 0;

        if (num1 > 0) {
            posCount++;
        } else if (num1 < 0) {
            negCount++;
        }
        if (num2 > 0) {
            posCount++;
        } else if (num2 < 0) {
            negCount++;
        }
        if (num3 > 0) {
            posCount++;
        } else if (num3 < 0) {
            negCount++;
        }
        System.out.println("Положительных чисел: " + posCount);
        System.out.println("Отрицательных чисел: " + negCount);
    }
}