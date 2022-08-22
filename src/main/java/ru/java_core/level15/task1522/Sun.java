package ru.java_core.level15.task1522;

public class Sun implements Planet {
    private static Sun instance;

    private Sun(){
    }

    public static Sun getInstance(){
        if (instance == null) {
            synchronized (Sun.class){
                if (instance == null){
                    instance = new Sun();
                }
            }
        }
        return instance;
    }
}
