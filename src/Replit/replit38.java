package Replit;

import java.util.Scanner;

public class replit38 {
    public static void main(String[] args) {

        System.out.println("Is it weekend?");
        Scanner input = new Scanner(System.in);
        boolean weekend=input.nextBoolean();

        if (!weekend){
            System.out.println("Today you will be learning manual testing");
        }else {
            System.out.println("Today you will be learning Java");
        }
    }
}
