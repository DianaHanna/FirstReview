package Replit;

import java.util.Scanner;

public class replit37 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty=input.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleepy=input.nextBoolean();

        if (thirsty && !sleepy){
            System.out.println("Looks like you need to drink water");
        } else if (thirsty && sleepy) {
            System.out.println("Looks like you need to drink coffee");
        } else if (!thirsty && sleepy) {
            System.out.println("Looks like you need to drink tea");
        }else {
            System.out.println("Looks like you need to drink nothing");
        }
    }
}
