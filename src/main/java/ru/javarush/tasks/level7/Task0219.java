package ru.javarush.tasks.level7;

/*
Вывод текста на экран
Реализуй метод print3. Метод должен вывести переданную строку (слово) на экран три раза через пробел.
*/

public class Task0219 {
    public static void print3(String text) {
        //напишите тут ваш код
        for (int i = 0; i < 3; i++) {
            System.out.print(text + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
