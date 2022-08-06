package ru.java_syntax.level6;

/*
Создаем мультимассив
В методе main(String[]) выведи на экран все числа из трехмерного массива multiArray.

Требования:
•	В классе Solution должна быть публичная статическая переменная multiArray типа int[][][].
•	В методе main(String[]) выведи на экран все числа из multiArray.
*/
public class Task0512 {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.print(multiArray[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}
