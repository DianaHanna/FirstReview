package homeWork4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Enter  the number of the day");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();

            if (day<=5) {
                System.out.println("Weekday");
        } else if (day<=7) {
                System.out.println("Weekend");
            }else {
                System.out.println("Invalid day");
    }
}
    }
