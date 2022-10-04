package ru.java_core.level17.task1712;

public class Waiter implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        Manager manager = Manager.getInstance();

        while (continueWorking || !manager.getDishesQueue().isEmpty()) {
            if (!manager.getDishesQueue().isEmpty()) {       //������� ������� �����
                Dishes dishes = manager.getDishesQueue().poll();
                System.out.println("�������� ����� ����� ��� ����� �" + dishes.getTableNumber());
            } else {                                         //����� ����� �����
                Table table = manager.getNextTable();
                Order order = table.getOrder();
                System.out.println("������� ����� �� ����� �" + order.getTableNumber());
                manager.getOrderQueue().add(order);
            }
            try {
                Thread.sleep(100);  //walking to the next table
            } catch (InterruptedException e) {
            }
        }
    }
}