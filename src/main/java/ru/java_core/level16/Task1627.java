package ru.java_core.level16;

import java.util.ArrayList;
import java.util.List;

/*
��������?
*/

public class Task1627 {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<>();

        static {
            steps.add("������ ����");
            steps.add("���� ��������");
            steps.add("���� ���������");
            steps.add("�������� ������");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 3);
        protected Gamer gamer2 = new Gamer("Petrov", 1);
        protected Gamer gamer3 = new Gamer("Sidorov", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
                Thread.onSpinWait();
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private final int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            int num = 0;
            while (num < OnlineGame.steps.size()) {
                try {
                    Thread.sleep(1000 / rating);
                    System.out.println(this.getName() + ":" + OnlineGame.steps.get(num));
                    num++;
                    if (num == OnlineGame.steps.size() && !OnlineGame.isWinnerFound){
                        System.out.println(this.getName() + ":����������!");
                        OnlineGame.isWinnerFound = true;
                    }
                } catch (InterruptedException e) {
                    System.out.println(this.getName() + ":��������");
                    break;
                }
            }
        }
    }
}
