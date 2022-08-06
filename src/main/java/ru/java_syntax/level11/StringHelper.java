package ru.java_syntax.level11;

public class StringHelper {
    public static String multiply(String text) {
        return multiply(text, 5);
    }

    public static String multiply(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += text;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("supper"));
        System.out.println(multiply("text", 5));
    }
}
