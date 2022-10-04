package ru.java_core.level17.task1721;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            try (final BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
                 final BufferedReader reader2 = new BufferedReader(new FileReader(fileName2))) {
                String s1;
                String s2;
                while ((s1 = reader1.readLine()) != null){
                    allLines.add(s1);
                }
                while ((s2 = reader2.readLine()) != null){
                    forRemoveLines.add(s2);
                }
            }
        }
        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
