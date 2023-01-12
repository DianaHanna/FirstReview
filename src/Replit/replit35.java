package Replit;

import java.util.Scanner;

public class replit35 {
    public static void main(String[] args) {


        System.out.println("Do you need a loan?");
        Scanner scan = new Scanner(System.in);
        boolean needLoan = scan.nextBoolean();
        if(!needLoan) {
            System.out.println("The eligibility is Unknown");
        }
        if (needLoan) {
            System.out.println("What is your credit score?");
            int creditScore = scan.nextInt();
            if (creditScore<600) {
                System.out.println("The eligibility is Not eligible");
            } else if (creditScore>=600 && creditScore<=700) {
                System.out.println("The eligibility is Maybe eligible");
            } else if (creditScore >= 701 && creditScore<=800) {
                System.out.println("The eligibility is Eligible");
            } else if (creditScore > 800) {
                System.out.println("The eligibility is Definitely eligible");
            }
        }
    }
}
