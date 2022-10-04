package ru.java_core.level17.task1715;


import java.util.HashMap;
import java.util.Map;

public class DrugsController {
    public static Map<Drug, Integer> allDrugs = new HashMap<Drug, Integer>();   // <���������, ����������>

    static {
        Drug panadol = new Drug();
        panadol.setName("�������");
        allDrugs.put(panadol, 5);

        Drug analgin = new Drug();
        analgin.setName("��������");
        allDrugs.put(analgin, 18);

        Drug placebo = new Drug();
        placebo.setName("�������");
        allDrugs.put(placebo, 1);
    }

    public synchronized void buy(Drug drug, int count) {
        String name = Thread.currentThread().getName();
        if (!allDrugs.containsKey(drug)) {
            System.out.println("��� � �������");
        }
        Integer currentCount = allDrugs.get(drug);
        if (currentCount < count) {
            System.out.println(String.format("%s ����� %s %d ��. � ������� - %d", name, drug.getName(), count, currentCount));
        } else {
            allDrugs.put(drug, (currentCount - count));
            System.out.println(String.format("%s �����(�) %s %d ��. �������� - %d", name, drug.getName(), count, (currentCount - count)));
        }
    }

    public synchronized void sell(Drug drug, int count) {
        System.out.println(Thread.currentThread().getName() + " ������� " + drug.getName() + " " + count);
        if (!allDrugs.containsKey(drug)) {
            allDrugs.put(drug, 0);
        }
        Integer currentCount = allDrugs.get(drug);
        allDrugs.put(drug, (currentCount + count));
    }
}

