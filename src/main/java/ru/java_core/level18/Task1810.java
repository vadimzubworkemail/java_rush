package ru.java_core.level18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
DownloadException
*/

public class Task1810 {
    public static void main(String[] args) throws DownloadException, IOException {
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true){
                try (final FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
                    if (fileInputStream.available() < 1000) throw new DownloadException();
                }
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
