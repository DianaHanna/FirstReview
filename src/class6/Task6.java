package class6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        System.out.println("Enter 3 distinct numbers");
        Scanner scan = new Scanner(System.in);
        double num1=scan.nextDouble();// also can be int num2,num2,num3;
        double num2=scan.nextDouble();
        double num3=scan.nextDouble();

        if ((num1>num2)&&(num1>num3)){
            System.out.println("The largest number is " +num1);
        }else if ((num2>num1)&&(num2>num3)){
            System.out.println("The largest number is " +num2);
        }else if ((num3>num1)&&(num3>num2)){
            System.out.println("The largest number is " +num3);
        }
        }
    }

