package Replit;

import java.util.Scanner;

public class replit41 {
    public static void main(String[] args) {

        System.out.println("Enter the age of the Child");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        switch (age){
            case 1:
        System.out.println("You can Crawl");
        break;
            case 2:
                System.out.println("You can Talk");
                break;
            case 3 :
                System.out.println("You can Dance");
                break;
            case 4:
                System.out.println("You can get Trouble");
                break;
            default:
                System.out.println("I don't know how old you are");
        }
    }
}
