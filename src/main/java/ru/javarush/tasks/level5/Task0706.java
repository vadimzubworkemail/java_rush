package ru.javarush.tasks.level5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Улица и дома

Создать массив на 15 целых чисел.
Ввести в него значения с клавиатуры.
Пускай индекс элемента массива является номером дома, а значение — числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой. Выяснить, на какой стороне улицы проживает больше жителей.
Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."
Примечание: дом с порядковым номером 0 считать четным.
*/

public class Task0706 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int j = 0; j < array.length; j++) {
            if (j % 2 == 0) {
                sum1 += array[j];
            } else {
                sum2 += array[j];
            }
        }
        if (sum1 > sum2) {
            System.out.println(
                    "В домах с четными номерами проживает больше жителей.");
        } else if (sum1 < sum2) {
            System.out.println(
                    "В домах с нечетными номерами проживает больше жителей.");
        } else {
            System.out.println();
        }
    }
}
