package ru.java_core.level13.task1327;
import java.util.ArrayList;
import java.util.List;

/*
�����
*/
public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("�����", "�����"));
        plot.add(new Person("�����", "�����"));
        plot.add(new Person("�����", "�����"));
        plot.add(new Person("������", "������"));
        RepkaStory.tell(plot);
    }
}
