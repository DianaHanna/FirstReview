package homeWork4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        System.out.println("Enter your Country");
        Scanner scan = new Scanner(System.in);
        String country=scan.next();

        switch (country){
            case "Egypt":
                System.out.println("Arabic");
                break;
            case "Italy":
                System.out.println("Italian");
                break;
            case "China":
                System.out.println("Mandarin");
                break;
            case "USA":
                System.out.println("English");
                break;
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
