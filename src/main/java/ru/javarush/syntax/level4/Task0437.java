package ru.javarush.syntax.level4;

/*
Рисуем треугольник
Используя цикл for, выведи на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
*/
public class Task0437 {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
