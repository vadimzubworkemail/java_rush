package ru.java_core.level17.task1720;
public class Bankomat {

    static BankAccount account = new BankAccount("Amigo");

    public static volatile boolean isStopped;

    public static void main(String[] args) throws InterruptedException {
        addMoney.start();
        SpendThread spendThread = new SpendThread();
        SpendThread spendThread1 = new SpendThread();
        SpendThread spendThread2 = new SpendThread();
        spendThread.start();
        spendThread1.start();
        spendThread2.start();
        Thread.sleep(4000);
        isStopped = true;
    }

    private static Thread addMoney = new Thread() {
        @Override
        public void run() {
            while (!isStopped) {
                account.deposit("1000");            //������ �� ����
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    };


    public static class SpendThread extends Thread {

        @Override
        public void run() {
            while (!isStopped) {
                try {
                    account.withdraw("100");             //������� �� �����
                } catch (NotEnoughMoneyException e) {
                    System.out.println("������������ �����");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}


