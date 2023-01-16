package NestedForLoopsHomework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
double total=0;
        for (int i = 0; i < 5; i++) {

            System.out.println("Please enter the item and it's price");
            String itemName=scanner.next();
            double itemPrice=scanner.nextDouble();
            total=total+itemPrice;
            System.out.println("This is the total amount you have to pay "+total);
        }
        System.out.println("Please pay for the items");
double amountPaid=scanner.nextDouble();

if (amountPaid>total){
    double change=amountPaid-total;
    System.out.println("Hey here is your change "+change);
}
        System.out.println("Thank you for shopping");

        }
    }

