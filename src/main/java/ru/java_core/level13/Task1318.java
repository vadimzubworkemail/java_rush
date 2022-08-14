package ru.java_core.level13;

import java.io.*;
import java.util.Scanner;

public class Task1318 {
    public static void main(String[] args) throws Exception {

        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFile = reader.readLine();
        final FileInputStream stream = new FileInputStream(sourceFile);

        final Scanner scanner = new Scanner(stream);
        final StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine()).append("\n");
        }
        System.out.print(stringBuilder.toString());
        reader.close();
        scanner.close();
    }
}
