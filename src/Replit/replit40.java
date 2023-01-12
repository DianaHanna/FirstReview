package Replit;

import java.util.Scanner;

public class replit40 {
    public static void main(String[] args) {

        System.out.println("Enter name of the instructor");
        Scanner input = new Scanner(System.in);
        String instructorName = input.nextLine();

        switch (instructorName.toLowerCase()){
            case "Asghar":
                System.out.println("Will take care of Java Assignment");
                break;
            case "Moazzam":
                System.out.println("Will take care of SDLC Assignment");
                break;
            case "Weqas":
                System.out.println("Will take care of Selenium Assignment");
                break;
            case "Asel":
                System.out.println("Will take care of every Assignment");
                break;
            default:
                System.out.println("Invalid instructor selected");
        }
    }
}
