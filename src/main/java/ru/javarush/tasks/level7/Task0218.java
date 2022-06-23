package ru.javarush.tasks.level7;

/*
Дублирование строки
Реализуй метод print3. Метод должен вывести на экран переданную строку 3 раза.
Каждый раз - с новой строки.
*/
public class Task0218 {
    public static void print3(String text) {
        //напишите тут ваш код
        for (int i = 0; i < 3; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}
