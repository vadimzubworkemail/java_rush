package ru.javarush.tasks.level4;


/*
Четные числа
Используя цикл for, выведи на экран чётные числа от 1 до 100 включительно.
Каждое значение выведи с новой строки.
*/
public class Task0435 {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}