package ru.java_core.level14.task1417;

import java.util.ArrayList;
import java.util.List;

/*
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
         ivan.allMoney.add(new USD(100));
         ivan.allMoney.add(new Ruble(200));
         ivan.allMoney.add((new Hryvnia(300)));
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
        }

        private List<Money> allMoney;


        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}

