package ru.javarush.tasks.level6;

import java.util.Arrays;

/*
Создайте класс, в котором создайте метод showArray. Инпут параметром данного метода будет двумерный массив
типа String. Метод должен выводить на экран данный массив в следующем виде:
{ {элемент00, элемент01}, {элемент10}, {элемент10, элемент11}, }
Содержимое, естественно будет зависеть от твоего массива.
Продемонстрируй данный метод.
 */
public class UdemyArrayHomeWork2 {
    public static String[][] showArray(String[][] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.print(strings[i][j] + " ");
            }
            System.out.println();
        }
        return strings;
    }

    public static void main(String[] args) {
        String [][] str = new String[][]{{"элемент00", "элемент01"}, {"элемент10"}, {"элемент10", "элемент11"}};
        showArray(str);
    }
}
