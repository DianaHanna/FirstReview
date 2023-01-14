package class8;

import java.util.Scanner;

public class Replit63 {
    public static void main(String[] args) {

        Scanner fetch = new Scanner(System.in);
        System.out.println("Please enter the number");
        int x=fetch.nextInt();

        for (int i = 0; i < x ; i++) {
            System.out.print(i + " "); // prints the number on the same line +" " adds space after each number
        }
        System.out.println();
    }
}
