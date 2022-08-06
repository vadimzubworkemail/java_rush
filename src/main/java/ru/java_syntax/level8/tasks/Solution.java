package ru.java_syntax.level8.tasks;

import java.util.Arrays;

/*
Любимые настолки
Составь собственный ТОП-5 любимых настольных игр.
Требования:
•	В методе main нужно заполнить массив collection объектами BoardGame.
•	У каждого объекта BoardGame должно быть уникальное имя (поле name).
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {

        collection[0] = new BoardGame("Шахматы");
        collection[1] = new BoardGame("Домино");
        collection[2] = new BoardGame("Лото");
        collection[3] = new BoardGame("Шашки");
        collection[4] = new BoardGame("Нарды");

        System.out.println(Arrays.toString(collection));
    }
}
