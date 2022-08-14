package ru.java_core.level13.task1328;

public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("�����");
        Robot enemy = new Robot("����������-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(Robot robotFirst, Robot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defended = robotSecond.defense();
        System.out.println(String.format("%s �������� ������ %s, ��������� %s, �������� %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defended));
    }
}
