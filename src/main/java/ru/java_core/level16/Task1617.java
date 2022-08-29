package ru.java_core.level16;

public class Task1617 {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            Thread current = Thread.currentThread();
            try {
                while (numSeconds > 0 && !current.isInterrupted()) {
                    System.out.print(numSeconds-- + " ");
                    Thread.sleep(1000);
                }
                System.out.println("Марш!");
            } catch (InterruptedException e) {
                System.out.println("Прервано!");
            }
        }
    }
}
