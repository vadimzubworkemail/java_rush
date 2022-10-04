package ru.java_core.level17;

public class Task1706 {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident);
    }

    public static class OurPresident {
        private static OurPresident president;

        private OurPresident() {
        }


        static {
            synchronized (OurPresident.class){
                if (president == null){
                    president = new OurPresident();
                }
            }
        }

        public static OurPresident getOurPresident(){
            return president;
        }


    }
}
