package class11;

public class Task1 {
    public static void main(String[] args) {

        /*
         *
         **
         * ***
         * ***
         * **
         * **
         * *
         *
         */

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4 ;i++) {
            for (int j = 0; j < 4-i; j++) { // j<4-i reverses the logic
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}