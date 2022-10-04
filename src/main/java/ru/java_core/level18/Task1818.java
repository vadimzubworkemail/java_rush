package ru.java_core.level18;

import java.io.*;

/*
ƒва в одном
*/

public class Task1818 {
    public static void main(String[] args) throws IOException {

        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();

        try (final FileOutputStream fileWriter = new FileOutputStream(file1, true);
             final FileInputStream fileReaderFirst = new FileInputStream(file2);
             final FileInputStream fileReaderSecond = new FileInputStream(file3)) {
            while (fileReaderFirst.available() > 0) {
                fileWriter.write(fileReaderFirst.read());
            }
            while (fileReaderSecond.available() > 0) {
                fileWriter.write(fileReaderSecond.read());
            }
        }
    }
}
