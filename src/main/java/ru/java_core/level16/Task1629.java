package ru.java_core.level16;

import java.io.*;

/*
Только по-очереди!
*/

public class Task1629 {
    final static String testFile = "src\\main\\resources\\java_test";
    public static volatile BufferedReader reader;

    static {
        try {
            reader = new BufferedReader(new FileReader(testFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {

        StringBuilder builder = new StringBuilder();
        int count = 0;

        @Override
        public void run() {
            try {
                while (count < 3){
                    builder.append(reader.readLine()).append(" ");
                    count++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult() {
            System.out.println(builder);
        }
    }
}
