package ru.java_core.level18;


import java.io.FileReader;
import java.io.IOException;

/*
Английские буквы
*/
public class Task1816 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        try (final FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int engLetter = fileReader.read();
                if (engLetter >= 65 && engLetter <= 90 || engLetter >= 97 && engLetter <= 122) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}