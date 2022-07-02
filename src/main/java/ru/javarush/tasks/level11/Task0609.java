package ru.javarush.tasks.level11;

/*
Расстояние между двумя точками
*/

public class Task0609 {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        int xx = x2 - x1;
        int yy = y2 - y1;
        return Math.sqrt(xx * xx + yy * yy);
    }

    public static void main(String[] args) {

    }
}
