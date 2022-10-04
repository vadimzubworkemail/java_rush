package ru.java_core.level17;

import java.util.ArrayList;
import java.util.List;

/*
�������
*/

public class Task1701 {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class Note {

        public static final List<String> notes = new ArrayList<>();

        public static void addNote(String note) {
            notes.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("������ ���� ������� ���� �������");
            } else if (!note.startsWith(threadName)) {
                System.out.println("���� [" + threadName + "] ������� ����� ������� [" + note + "]");
            } else {
                System.out.println("���� [" + threadName + "] ������� ���� ������� [" + note + "]");
            }
        }
    }

    public static class NoteThread extends Thread {

        @Override
        public void run(){
            for (int i = 0; i < 1000; i++) {
                Note.addNote(getName() + "-Note" + i);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Note.removeNote(getName());
            }
        }
    }
}
