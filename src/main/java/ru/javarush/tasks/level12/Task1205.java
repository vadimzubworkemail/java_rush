package ru.javarush.tasks.level12;

public class Task1205 {

    private static String UNEXPECTED_TYPE = "Я такого типа числа не жду!";

    public static void main(String[] args) {
        System.out.println(toCustomString((byte) 12));
        System.out.println(toCustomString(12));
        System.out.println(toCustomString(12.));
        System.out.println(toCustomString(12L));
    }

    public static String toCustomString(Number number) {
        if (number instanceof Byte) {
            Byte b = (Byte) number;
            return Byte.toString((byte) (b / 2)) + "b";
        } else if (number instanceof Integer) {
            Integer i = (Integer) number;
            return Integer.toString(i / 3);
        } else if (number instanceof Double) {
            Double d = (Double) number;
            return Double.toString(d * 20);
        } else {
            return UNEXPECTED_TYPE;
        }
    }
}
