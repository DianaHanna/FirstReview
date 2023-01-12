package class4;

import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        if (number%2==0){
            System.out.println("Value is even");
            if (number>=1000){
                System.out.println("Even value is large");
            }else{
                System.out.println("Even value is just right");
            }
        }
        if (number%2!=0){
            System.out.println("Value is odd");
            if (number>=1000){
                System.out.println("Odd value is large");
            }else{
                System.out.println("Odd value is just right");
            }
        }
    }
}
