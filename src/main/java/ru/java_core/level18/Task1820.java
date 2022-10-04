package ru.java_core.level18;

import java.io.*;

/*
Округление чисел
*/

public class Task1820 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();

        try (final BufferedReader reader = new BufferedReader(new FileReader(fileName1));
             final FileWriter fileWriter = new FileWriter(fileName2)) {
            while (reader.ready()) {
                String[] array = reader.readLine().split(" ");
                for (String s : array) {
                    double num = Double.parseDouble(s);
                    long roundNum = Math.round(num);
                    fileWriter.write(roundNum + " ");
                }
            }
        }
    }
}
