package ru.java_core.level18;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
׀וגונס פאיכא
*/
public class Task1809 {
    public static void main(String[] args) throws IOException {
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             final FileInputStream fileInputStream = new FileInputStream(reader.readLine());
             final FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine())) {

            final ArrayList<Integer> list = new ArrayList<>();
            while (fileInputStream.available() > 0) {
                list.add( fileInputStream.read());
            }
            Collections.reverse(list);
            for (Integer integer : list){
                fileOutputStream.write(integer);
            }
        }
    }
}
