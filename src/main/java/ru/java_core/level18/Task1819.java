package ru.java_core.level18;

import java.io.*;
import java.util.ArrayList;

/*
Объединение файлов
*/

public class Task1819 {
    public static void main(String[] args) throws IOException {

        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (final FileInputStream fileInputStream1 = new FileInputStream(fileName2);
             final FileInputStream fileInputStream2 = new FileInputStream(fileName1)) {
            while (fileInputStream1.available() > 0){
                byteArrayOutputStream.write(fileInputStream1.read());
            }
            while (fileInputStream2.available() > 0){
                byteArrayOutputStream.write(fileInputStream2.read());
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }
    }
}