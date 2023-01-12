package Replit;

import java.util.Scanner;

public class replit44 {
    public static void main(String[] args) {

        System.out.println("Please enter your favourite car make");
        Scanner input = new Scanner(System.in);
        String model = input.nextLine();

        switch (model) {
            case "BMW":
                System.out.println("Your favorite car is german car");
                break;
            case "Toyota":
                System.out.println("Your favorite car is japanese car");
                break;
            case "Maserati":
                System.out.println("Your favorite car is italian car");
                break;
            default:
                System.out.println("Your favorite car is unknown");
        }
    }
}
