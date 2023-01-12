package Replit;

import java.util.Scanner;

public class replit42 {
    public static void main(String[] args) {

        System.out.println("Enter the roll number of the child");
        Scanner scan = new Scanner(System.in);
        int rollNumber = scan.nextInt();
        switch (rollNumber){
            case 101:
                System.out.println("Student name: Ramesh");
                break;
            case 102:
                System.out.println("Student name: Mahesh");
                break;
            case 103:
                System.out.println("Student name: Mukesh");
                break;
            default:
                System.out.println("Not found Student name: in Class");
        }
    }
}
