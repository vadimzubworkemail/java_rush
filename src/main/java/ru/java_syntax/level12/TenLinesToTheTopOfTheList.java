package ru.java_syntax.level12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
//Создай список строк в методе main.
//Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//Используя цикл, выведи содержимое на экран, каждое значение с новой строки.

public class TenLinesToTheTopOfTheList {
    public static void main(String[] args) throws Exception {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = bufferedReader.readLine();
            list.add(0, s);
        }
        for (String string : list) {
            System.out.println(string);
        }
    }
}
