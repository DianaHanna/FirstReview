package Review8;

import Review7.Car;
import Review7.Tesla;

public class CarTest {
    public static void main(String[] args) {

        BMW bmw=new BMW("BMW","X7");
        bmw.start();
        System.out.println(bmw.drive("smooth"));
        bmw.brake(); // comes from BMW which is subclass so not available to parent class

        Car car=new Car("SomeCar","SomeModel");
        car.start();
        car.drive(90);

        Tesla tesla=new Tesla("Tesla","S",2022,35,"Electric",true);
        tesla.start(); // override method from Tesla class
        tesla.drive(100); // comes from parent class
        tesla.haveAutoPilot(); // comes from Tesla class

        //Runtime polymorphism is achieved through method overriding
        // casting: widening and narrowing - used with primitives
        // up-casting and down-casting - used with non-primitives

        Car bmw1=new BMW("BMW","X77"); //upcasting
        bmw1.start();
        bmw1.drive(75);
        bmw1.drive(100,"Miami");
    }
}
