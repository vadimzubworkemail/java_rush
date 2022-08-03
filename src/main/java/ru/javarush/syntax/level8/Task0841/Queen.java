package ru.javarush.syntax.level8.Task0841;

public class Queen {
    public static Worker[] workers;
    public static Soldier[] soldiers;

    public static void main(String[] args) {
        populate();

        //напишите тут ваш код
        for (Worker worker : workers){
            worker.sendForFood();
        }
        for (Soldier soldier : soldiers){
            soldier.sendIntoBattle();
        }
    }


    public static void populate() {
        workers = new Worker[800];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
        }

        soldiers = new Soldier[70];
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i] = new Soldier();
        }
    }
}
