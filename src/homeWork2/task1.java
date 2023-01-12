package homeWork2;

import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();

        if (number1>number2){
            if (number1>number3){
                System.out.println("The largest number is "+number1);
            }
        }
        if (number2>number1){
            if (number2>number3){
                System.out.println("The largest number is "+number2);
            }
        }
        if (number3>number1){
            if (number3>number2){
                System.out.println("The largest number is "+number3);
            }
        }
    }

}
