package ru.java_core.level18.task1812;

import java.io.*;

public class TestFileOutputInputBufferedInputStream {
    public static void main(String[] args) throws IOException {


        File file = new File("src\\main\\resources\\java_test.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!\r\n";

        fileOutputStream.write(greetings.getBytes());

        fileOutputStream.close();

        int i;
        while ((i = reader.read()) != -1){
            System.out.print((char) i);
        }
        reader.close();
    }
}
