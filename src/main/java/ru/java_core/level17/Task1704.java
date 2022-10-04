package ru.java_core.level17;

import java.util.ArrayList;
import java.util.List;

/*
������������������ ������� 2
*/

public class Task1704 {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public synchronized void addNote(int index, String note) {
            System.out.println("������ ����� ��������� ������� [" + note + "] �� ������� " + index);
            notes.add(index, note);
            System.out.println("��� ��������� ������� [" + note + "]");
        }

        public synchronized void removeNote(int index) {
            System.out.println("������ ����� ������� ������� � ������� " + index);
            String note = notes.remove(index);
            System.out.println("��� ������� ������� [" + note + "] � ������� " + index);
        }
    }
}
