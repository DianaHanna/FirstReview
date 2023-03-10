package class15;

import java.util.Scanner;

public class MethodsDemo1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        System.out.println("You entered "+number);

        Methods methods=new Methods();
       // String number2=methods.doSomething();// gives error since it was stored with void method
        char c=methods.method2();

    }
}
