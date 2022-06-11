package ru.javarush.tasks.level3;

import java.util.Scanner;

/*
Положительное и отрицательное число

Введи с клавиатуры число. Если число положительное, увеличь его в два раза. Если число отрицательное, прибавь единицу.
Если введенное число равно нулю, выведи число ноль.
Выведи результат на экран.
*/
public class Task0412 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a > 0) {
            a *= 2;
            System.out.println(a);
        } else if (a < 0) {
            a += 1;
            System.out.println(a);
        } else {
            System.out.println(0);
        }
    }
}
