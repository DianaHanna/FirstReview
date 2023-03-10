package Review4;

public class Clock {
    public static void main(String[] args) {
        for (int a = 0; a < 24; a++) {

            for (int b = 1; b <60; b++) {

                if (b<10) {
                    System.out.println(a + ":" + "0" + b);
                }else
                    System.out.println(a + ":" + b);
            }
        }
        }
    }
