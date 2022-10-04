package ru.java_core.level18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Разделение файла
*/

public class Task1808 {
    public static void main(String[] args) throws Exception {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
             FileOutputStream fileOutputStream2 = new FileOutputStream(bufferedReader.readLine());
             FileOutputStream fileOutputStream3 = new FileOutputStream(bufferedReader.readLine())) {

            byte[] buffer = new byte[fileInputStream.available()];
            byte[] file2;
            byte[] file3;

            if (buffer.length % 2 == 0){
                file2 = Arrays.copyOfRange(buffer, 0, buffer.length / 2);
                file3 = Arrays.copyOfRange(buffer, buffer.length / 2, buffer.length);
            } else {
                file2 = Arrays.copyOfRange(buffer, 0, buffer.length / 2 + 1);
                file3 = Arrays.copyOfRange(buffer, buffer.length / 2 + 1, buffer.length);
            }

            fileOutputStream2.write(file2);
            fileOutputStream3.write(file3);
        }
    }
}

/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile1 = reader.readLine();
        String outputFile2 = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream1 = new FileOutputStream(outputFile1);
             FileOutputStream fileOutputStream2 = new FileOutputStream(outputFile2)) {

            int halfOfFile = (fileInputStream.available() + 1) / 2;
            int numberOfByte = 0;
            while (fileInputStream.available() > 0) {
                if (numberOfByte < halfOfFile) {
                    fileOutputStream1.write(fileInputStream.read());
                    numberOfByte++;
                } else fileOutputStream2.write(fileInputStream.read());
            }
        }
    }
}
 */