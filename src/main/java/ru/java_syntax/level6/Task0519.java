package ru.java_syntax.level6;

import java.util.Arrays;

/*
Есть ли кто?
Реализуй метод main(String[]), который выводит в консоль true, если элемент содержится в переданном массиве, иначе — false.
Массив array не должен изменять расположение своих элементов.
Для поиска элемента в массиве нужен бинарный поиск. Чтобы это сделать,
используй статический метод Arrays.binarySearch(int[], int) класса Arrays.
Первым параметром нужно передать отсортированный массив, в котором выполнить поиск,
вторым параметром — искомый элемент. Метод Arrays.binarySearch(int[], int) возвращает индекс искомого элемента,
если такой элемент есть в массиве.
Для сортировки массива можно использовать метод Arrays.sort(int[]).
При тестировании значения переменных класса Solution будут разными.
*/

public class Task0519 {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //напишите тут ваш код
        int[] dupl  = Arrays.copyOf(array, array.length);
        Arrays.sort(dupl);
        System.out.println(Arrays.binarySearch(dupl, element));
    }
}
