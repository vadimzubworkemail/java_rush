package ru.java_core.level13;

public class Task1305 {

//  очень важная задача для понимания!!!

    public static void main(String[] args) {

        System.out.println(Dream.HOBBY);
        System.out.println(new Hobby());
        System.out.println(new Hobby());
        System.out.println(new Hobby());
        Dream oneMoreHobby = new Hobby();
        System.out.println(oneMoreHobby.HOBBY);
        System.out.println(oneMoreHobby.HOBBY.HOBBY);
        System.out.println(oneMoreHobby.HOBBY.HOBBY.HOBBY.HOBBY.HOBBY.HOBBY);

    }

    interface Desire {
    }

    interface Dream {
        Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 0;

        @Override
        public String toString() {
            return "добавляется индекс : " + ++INDEX + " : " + super.toString();
        }
    }
}
