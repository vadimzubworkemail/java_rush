package ru.javarush.syntax.level4;

/*
10 чисел наоборот
Выведи на экран числа от 10 до 1, используя цикл while.
Каждое значение - с новой строки.
*/
public class Task0431 {
    public static void main(String[] args) {
        int i = 10;

        while (i > 0){
            System.out.println(i);
            i--;
        }
    }
}
