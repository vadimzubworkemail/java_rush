package ru.java_core.level17.task1712;

public class Cook implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        boolean needToWait;
        while (continueWorking || needToCookOrders()) {
            try {
                synchronized (this) {
                    needToWait = !needToCookOrders();
                    if (!needToWait) {
                        cook();
                    }
                }
                if (continueWorking && needToWait) {
                    System.out.println("����� ��������");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    private boolean needToCookOrders() {
        return !Manager.getInstance().getOrderQueue().isEmpty();
    }

    private void cook() throws InterruptedException {
        Manager manager = Manager.getInstance();
        Order order = manager.getOrderQueue().poll();      // ����� ����� ����� �� �������
        System.out.println(String.format("����� ����� ���������� %d �� ��� ����� �%d", order.getTime(), order.getTableNumber()));
        Thread.sleep(order.getTime());     // ������� �����
        Dishes dishes = new Dishes(order.getTableNumber()); //  ��� ������� �����
        manager.getDishesQueue().add(dishes);
        System.out.println(String.format("����� ��� ����� �%d �����", dishes.getTableNumber()));
    }
}
