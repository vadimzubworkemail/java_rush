package ru.javarush.tasks.level5;
/*Создайте класс, в котором создайте метод sortirovka. Инпут параметром данного метода будет одномерный массив типа int.
Метод должен возвращать уже отсортированный по возрастанию массивю.
Продемонстрируйте данный метод.
 */

import java.util.Arrays;

public class UdemyArrayHomeWork1 {
    public static int[] sortirovka(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        int[] num = {3, 8, -3, 44, 38, 0, 7};
        sortirovka(num);
    }

}
