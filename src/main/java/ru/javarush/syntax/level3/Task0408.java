package ru.javarush.syntax.level3;

/*
Хорошо или плохо?

Напиши метод compare(int a), чтобы он:
выводил на экран строку "Число меньше 5", если параметр метода меньше 5,
иначе выводил строку "Число больше или равно 5".
*/
public class Task0408 {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        //напишите тут ваш код
        if (a < 5) {
            System.out.println("Писло меньше 5");
        } else {
            System.out.println("Писло больше или равно 5");
        }
    }
}
