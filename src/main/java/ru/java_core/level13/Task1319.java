package ru.java_core.level13;

import java.io.*;

public class Task1319 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = "";
            for (int i = 0; i < 1; i++) {
                fileName = reader.readLine();
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter(fileName))) {
                final StringBuilder stringBuilder = new StringBuilder();
                String str = "";
                while (!str.equals("exit")) {
                    str = reader.readLine();
                    stringBuilder.append(str).append("\n");
                }
                bufferedWriter.write(stringBuilder.toString());
            }
        }
    }
}
