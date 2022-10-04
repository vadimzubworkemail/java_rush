package ru.java_core.level18;

import java.io.*;
import java.util.*;

/*
Нити и байты
*/

public class Task1823 {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String fileName;
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!(fileName = reader.readLine()).equals("exit")) new ReadThread(fileName);
        }
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
            start();
        }

        @Override
        public void run(){
            byte[] bytes = new byte[256];
            try (final FileInputStream fileInputStream = new FileInputStream(fileName)) {
                while (fileInputStream.available() > 0){
                    bytes[fileInputStream.read()]++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            int date = 0;
            int countByte = 0;
            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] > date){
                    date = bytes[i];
                    countByte = i;
                }
            }
            resultMap.put(fileName, countByte);
        }
    }
}
