package ru.javarush.syntax.level6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayActions {
    public static void main(String[] args) {
//        Вывод чисел из массива
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99, 0};
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "]=" + array[i] + "  ");
        }
        System.out.println();

//        Заполнение массива из 10 чисел, числами от 1 до 10:
        int[] num1 = new int[10];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = i + 1;
            System.out.print(num1[i] + "  ");
        }
        System.out.println();

//        Заполнение массива из 10 чисел, числами от 10 до 1:
        int[] num2 = new int[10];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = 10 - i;
            System.out.print(num2[i] + "  ");
        }
        System.out.println();

//        Заполнение массива из 10 чисел, числами от 0 до 9:
        int[] num3 = new int[10];
        for (int i = 0; i < num3.length; i++) {
            num3[i] = i;
            System.out.print(num3[i] + "  ");
        }
        System.out.println();

//        Заполнение массива из 10 чисел, числами от 9 до 0:
        int[] num4 = new int[10];
        for (int i = 0; i < num4.length; i++) {
            num4[i] = 9 - i;
            System.out.print(num4[i] + "  ");
        }
        System.out.println();

//        Быстрая (статическая) инициализация. Сумма элементов массива:
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println("Sum is " + sum);

//        Поиск минимального элемента в массиве:
        int[] list1 = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] < min){
                min = list1[i];
            }
        }
        System.out.println("Min is " + min);
        System.out.println();

//        Ввод и вывод массива
        Scanner scanner = new Scanner(System.in);
        int personCount = 5;
        String[] person = new String[personCount];
        int[] salary = new int[personCount];
        for (int i = 0; i < personCount; i++) {
            person[i] = scanner.next();
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println("Input salary for person " + person[i] + ": ");
            salary[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(person));
        for (int value : salary) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
