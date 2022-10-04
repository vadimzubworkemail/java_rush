package ru.java_core.level18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestPrintStream {
    private static final String GREETINGS_MESSAGE = "My name is %s, my age is %d!\n";

    public static void main(String arr[]) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(new FileOutputStream(
                "C:\\Users\\Vadim Zub\\Desktop\\test_java.txt", true));

        printStream.println("Hello!");
        printStream.println("We are robots!");

        printStream.printf(GREETINGS_MESSAGE, "Amigo", 18);
        printStream.printf(GREETINGS_MESSAGE, "R2-D2", 35);
        printStream.printf(GREETINGS_MESSAGE, "C-3PO", 35);

        printStream.close();
    }
}
