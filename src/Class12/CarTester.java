package Class12;

import class11.Cat;

public class CarTester {
    public static void main(String[] args) {
        // Create the object of the class
        Car BMW=new Car();
        BMW.make="BMW";
        BMW.model="i7";
        BMW.year=2023;
        BMW.color="Grey";
        BMW.moveForward();
       BMW.applyBrakes();

        Car Audi=new Car();
        Audi.make="Audi";
        Audi.model="Q5";
        Audi.year=2022;
        Audi.color="Black";
        Audi.moveForward();

    }
}
