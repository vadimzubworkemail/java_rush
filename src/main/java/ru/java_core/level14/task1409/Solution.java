package ru.java_core.level14.task1409;

/*
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge) {
        if (bridge instanceof WaterBridge){
            System.out.println(bridge.getCarsCount());
        } else if (bridge instanceof SuspensionBridge){
            System.out.println(bridge.getCarsCount());
        }
    }
}

