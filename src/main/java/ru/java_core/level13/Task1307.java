package ru.java_core.level13;

public class Task1307 {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>
    {
        @Override
        public SimpleObject getInstance() {
            return this;
        }
    }
}
