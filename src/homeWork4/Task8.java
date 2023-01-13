package homeWork4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        System.out.println("Enter your grade");
        Scanner scan = new Scanner(System.in);
   String grade = scan.nextLine();

        switch (grade){
            case "A":
                System.out.println("A is Excellent");
                break;
            case "B":
                System.out.println("B is Good");
                break;
            case "C":
                System.out.println("C is Average");
                break;
            case "D":
                System.out.println("D is Bad");
                break;
            default:
                System.out.println("Unknown");
        }

    }
}
