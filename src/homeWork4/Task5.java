package homeWork4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("Enter three distinct numbers");
        Scanner input = new Scanner(System.in);
       double num1 = input.nextDouble();
       double num2 = input.nextDouble();
       double num3 = input.nextDouble();

       if (num1>num2 && num1>num3){
           System.out.println("The largest number is "+num1);
       }else if (num2>num1 && num2>num3){
            System.out.println("The largest number is "+num2);
        }else if (num3>num1 && num3>num2){
            System.out.println("The largest number is "+num3);
        }


    }
}
