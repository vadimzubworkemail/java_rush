package ru.javarush.tasks.level7;

/*
Минимум четырех чисел

Напиши функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b).
Подсказка: нужно написать тело двух существующих функций min
*/

public class Task0217 {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
//        return (min(a, b) <= c && min(a, b) <= d ? min(a, b) : c <= d ? c : d);
        return min(min(a, b), min(c, d));
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        return (a < b ? a : b);
    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));

    }
}