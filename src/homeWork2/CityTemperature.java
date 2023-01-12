package homeWork2;

import java.util.Scanner;

public class CityTemperature {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println(" What is your city?");
        String city = scan.nextLine();
        System.out.println(" What is the temperature in your city?");
        int temp = scan.nextInt();
int celesius=((temp-32)*5/9);
        System.out.println(" The temperature in the city of " + city + " is " + celesius +"");

    }
}
