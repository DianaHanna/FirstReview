package Review5;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {


        // Let's create an array of names using Scanner

        Scanner scanner=new Scanner(System.in);
        System.out.println("How many names you want to store?");
        int size=scanner.nextInt();

        String [] names=new String[size];
        // this loop stores elements inside the array
        // regular for loop work with indexes

        for (int i = 0; i <names.length; i++) { // size will give me same output since names.length==size
            System.out.println("Please enter name");
            names[i]=scanner.next();
        }

        // using loop below we can retrieve element
        // enhanced for loop work with variable

        for (String a:names) {
            System.out.println(a);

        }
    }
}
