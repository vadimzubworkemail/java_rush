package ru.javarush.tasks.level9;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
Используя StringTokenizer раздели query на части по разделителю delimiter.
Пример:
getTokens("java.util.stream", "\\.")
возвращает массив строк
{"java", "util", "stream"}
Hint: решить задачу поможет метод countTokens().
*/

public class Task0915 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, ".");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens()){
            result[i++] = tokenizer.nextToken();
        }
        return result;
    }
}

