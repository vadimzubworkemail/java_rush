package ru.java_core.level17;


    /* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
//        Beach beach1 = new Beach("Beach1", 1000, 10);
//        Beach beach2 = new Beach("Beach2", 1000, 10);
//
//        System.out.println(beach1.compareTo(beach2));
//        System.out.println(beach2.compareTo(beach1));
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int sum = 0;
        if (getQuality() > o.quality){
            sum++;
        } else if (getQuality() < o.quality){
            sum--;
        }
        if (getDistance() < o.distance){
            sum++;
        } else if (getDistance() > o.distance){
            sum--;
        }
        return sum;
    }
}



