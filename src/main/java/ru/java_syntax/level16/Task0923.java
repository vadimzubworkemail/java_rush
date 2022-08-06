package ru.java_syntax.level16;

import java.io.BufferedReader;
import java.io.FileReader;

/*
Гласные и согласные буквы
*/

public class Task0923 {
    public static char[] vowels = new char[]{};

    public static void main(String[] args) throws Exception {
        final BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Vadim Zub\\Desktop\\Java_test.txt"));
        String string = reader.readLine();
        final StringBuilder builder1 = new StringBuilder();
        final StringBuilder builder2 = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (isVowel(c)) {
                builder1.append(c).append(" ");
            } else if (c != ' ') {
                builder2.append(c).append(" ");
            }
        }
        System.out.println(builder1);
        System.out.println(builder2);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
