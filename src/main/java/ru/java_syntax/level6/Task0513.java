package ru.java_syntax.level6;

import java.util.Arrays;

/*
Выводим массивы
Реализуй метод main(String[]), который выводит массивы strings и ints в консоли с помощью метода Arrays.toString().
*/
public class Task0513 {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));
    }
}
