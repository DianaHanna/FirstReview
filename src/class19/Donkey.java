package class19;

public class Donkey {

    String name; // instance values
    int age;
    double weight;

    /*
    Donkey(){
        System.out.println("This is non argument constructor");
    }
     */

    Donkey(String name, int age){ // local variables
        this.name=name; // THIS keyword to assign the value of the local variable to the instance value without changing its name
        this.age=age;

    }
    void print(){
        System.out.println("Donkey's name is "+name+" age is "+age+" weight is "+weight);
    }

    }

