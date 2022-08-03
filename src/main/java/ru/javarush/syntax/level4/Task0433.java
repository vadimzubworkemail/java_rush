package ru.javarush.syntax.level4;

/*
S-квадрат
Выведи на экран квадрат из 10х10 букв S, используя цикл while.
Буквы в каждой строке не разделяй пробелами.

Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
*/
public class Task0433 {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.print("S");
            }
            System.out.println();
        }
    }
}