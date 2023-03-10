package class22;

public class Animal {
    String name;
    String color;
    int age;
    double weight;
void speak(){
    System.out.println("Animals can speak");
}
 void eat(){
    System.out.println("All the animals eat");
}
}
class Cat extends Animal {
    void speak() {
        System.out.println("Meow Meow .............");
    }
}

class Dog extends Animal {

    // we are overriding speak method in Cat class
    void speak() {
        System.out.println("Woof Woof .......");
    }
}
    class Tester {
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.speak();
            Dog dog=new Dog();
            dog.speak();
        }
    }
