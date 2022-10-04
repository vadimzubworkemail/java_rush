package ru.java_core.level17;

import java.util.ArrayList;
import java.util.List;

/*
������������������ �������
*/
public class Task1703 {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            synchronized (notes){
                notes.add(index, note);
            }
            System.out.println("������ ����� ��������� ������� [" + note + "] �� ������� " + index);
            System.out.println("��� ��������� ������� [" + note + "]");
        }

        public void removeNote(int index) {
            String note;
            synchronized (notes){
                note = notes.remove(index);
            }
            System.out.println("������ ����� ������� ������� � ������� " + index);
            System.out.println("��� ������� ������� [" + note + "] � ������� " + index);
        }
    }
}
