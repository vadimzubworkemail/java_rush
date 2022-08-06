package ru.java_syntax.level6;

import java.util.Scanner;

/*
Шахматная доска
*/

public class Task0634 {
    public static char[][] array;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        array = new char[num][num];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}