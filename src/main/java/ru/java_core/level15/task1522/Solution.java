package ru.java_core.level15.task1522;

import java.io.*;

/*
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        final String testFile = "src\\main\\resources\\java_test";
        try (final BufferedReader reader = new BufferedReader(new FileReader(testFile))){
            String s = reader.readLine();
            switch (s) {
                case Planet.EARTH:
                    thePlanet = Earth.getInstance();
                    break;
                case Planet.MOON:
                    thePlanet = Moon.getInstance();
                    break;
                case Sun.SUN:
                    thePlanet = Sun.getInstance();
                    break;
                default:
                    thePlanet = null;
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

