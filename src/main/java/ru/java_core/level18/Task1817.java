package ru.java_core.level18;

import java.io.FileReader;
import java.io.IOException;

/*
Пробелы
*/
public class Task1817 {
    public static void main(String[] args) throws IOException {
        int countSpace = 0;
        int countChar = 0;

        try (final FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int ch = fileReader.read();
                countChar++;
                if (ch == (int) ' ') countSpace++;
            }
        }
            double ratio = (double) countSpace / countChar * 100;
            System.out.printf("%.2f", ratio);
    }
}
