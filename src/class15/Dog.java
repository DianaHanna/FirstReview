package class15;

public class Dog {

    String  name; // instance variables
    String breed; // instance variables
    String color; // instance variables

    static int noOfLegs=4; // static variable

    void printFood(){
        String food="Meat"; // local variable
        System.out.println(food);

        // only local variables are inside the method, static and instance are outside the method
    }
    void printColor(){
        System.out.println(name); // can be accessed anywhere in the class
       // System.out.println(food); error because it's local variable and it's outside the method
    }
}
