package homeWork4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter your height in inches");
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();

        if (height<60){
            System.out.println("Short");
        } else if (height<=72) {
            System.out.println("Medium");
        }else {
            System.out.println("Tall");
        }
        }
    }

