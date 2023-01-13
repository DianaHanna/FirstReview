package homeWork4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Enter your birth month");
        Scanner scan = new Scanner(System.in);
        String birthMonth=scan.nextLine();
        if (birthMonth.equals("June") || birthMonth.equals("July") | birthMonth.equals("August")){
            System.out.println("You were born in Summer");
        } else if (birthMonth.equals("September") || birthMonth.equals("October") | birthMonth.equals("November")) {
            System.out.println("You were born in Fall");
        } else if (birthMonth.equals("December") || birthMonth.equals("January") | birthMonth.equals("February")) {
            System.out.println("You were born in Winter");
        } else if (birthMonth.equals("March") || birthMonth.equals("April") | birthMonth.equals("May")) {
            System.out.println("You were born in Spring");
        }
    }
}
