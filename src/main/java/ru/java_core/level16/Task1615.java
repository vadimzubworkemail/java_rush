package ru.java_core.level16;

public class Task1615 {
    public static volatile Runway RUNWAY = new Runway();   // �������� ������

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("������� #1");
        Plane plane2 = new Plane("������� #2");
        Plane plane3 = new Plane("������� #3");
    }

    private static void waiting() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    private static void takingOff() {
        // ������� ���� �����
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean isAlreadyTakenOff = false;
            while (!isAlreadyTakenOff) {
                if (RUNWAY.trySetTakingOffPlane(this)) {    // ���� �������� ������ ��������, �������� ��
                    System.out.println(getName() + " ��������");
                    takingOff();// ��������
                    System.out.println(getName() + " ��� � ����");
                    isAlreadyTakenOff = true;
                    RUNWAY.setTakingOffPlane(null);
                } else if (!this.equals(RUNWAY.getTakingOffPlane())) {  // ���� �������� ������ ������ ���������
                    System.out.println(getName() + " �������");
                    waiting(); // �������
                }
            }
        }
    }

    public static class Runway { // �������� ������
        private Thread t;

        public Thread getTakingOffPlane() {
            return t;
        }

        public void setTakingOffPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetTakingOffPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}
