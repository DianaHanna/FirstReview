package class19;

public class Furniture {

    String type;
    double price;
    String color;

    // with the help of constructor we can initialize object with specific value
    Furniture(String type, double price,String color){ // constructor
        this.type=type;
        this.price=price;
        this.color=color;

    }
    /* below is a method wih name Furniture . why-because of return type
    void Furniture(){ // method
    }
     */

    void printInfo(){
        System.out.println(type+" price is "+price+" and color is "+color);
    }
}
