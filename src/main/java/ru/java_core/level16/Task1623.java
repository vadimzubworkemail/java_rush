package ru.java_core.level16;

public class Task1623 {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            start();
        }

        @Override
        public void run(){

            if (createdThreadCount < count){
                System.out.println(new GenerateThread());
            }
        }

        @Override
        public String toString() {
            return getName() + " created";
        }
    }
}
