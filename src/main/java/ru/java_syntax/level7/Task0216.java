package ru.java_syntax.level7;

/*
Минимум трех чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
Подсказка:
Нужно написать тело существующей функции min.
*/

public class Task0216 {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        return (a <= b && a <= c ? a : b <= c && b <= a ? b : c);
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
