package ru.java_core.level18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Шифровка
*/

public class Task1826 {
    public static void main(String[] args) throws IOException {
        if (!(args[0].equals("-e") || args[0].equals("-d"))) return;

        try (final FileInputStream fileInputStream = new FileInputStream(args[1]);
             final FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
            if (args[0].equals("-e")) {
                int i;
                while ((i = fileInputStream.read()) != -1) {
                    fileOutputStream.write(i + 100);
                }
            } else {
                int i;
                while ((i = fileInputStream.read()) != -1) {
                    fileOutputStream.write(i - 100);
                }
            }
        }
    }
}

