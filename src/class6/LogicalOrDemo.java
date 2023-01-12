package class6;

import java.util.Scanner;
import java.util.SortedMap;

public class LogicalOrDemo {
    public static void main(String[] args) {

        System.out.println("Please enter the day");
        Scanner input = new Scanner(System.in);
        String day = input.next();

        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
            System.out.println("No class today");

        } else if (day.equalsIgnoreCase("Saturday")|| day.equalsIgnoreCase("Sunday")) {
            System.out.println("Java Class");

        } else if (day.equalsIgnoreCase("Tuesday")|| day.equalsIgnoreCase("Wednesday")) {
            System.out.println("Manual testing class");
        } else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Review class");

        }else {
            System.out.println("Wrong day");
        }
input.close();
    }
}