package ru.java_core.level16;

public class Task1626 {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        private int countIndexUp = 1;

        @Override
        public void run() {
            try {
                while (true){
                    System.out.println(this);
                    countIndexUp += 1;
                    Thread.sleep(500);
                    if (countIndexUp > Task1626.number) return;
                }
            } catch (InterruptedException e){
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Task1626.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    countIndexDown -= 1;
                    Thread.sleep(500);
                    if (countIndexDown == 0) return;
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
