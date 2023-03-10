package Review6;

public class Garden {

    void hello(){
        String name="Adem"; // local variable
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {

        // static String str; we cannot use static with local variables
       // System.out.println(name); error because name is local variable

        Flower flower1=new Flower(); // creating the instance of the object by using new keyword
        // flower1 name of the reference variable
        // Flower is the declaration of the variable

        // accessing variables of Flower class
        System.out.println(Flower.pretty); // correct way accessing static variable just by calling class name
        flower1.name="Hisbiscus";
        flower1.color="red";
        flower1.price=5;
        flower1.pretty=false;
        System.out.println(flower1.pretty);
        System.out.println(flower1.price);
        //flower1.size; error since variable size doesn't exist in flower class

        // accessing methods of Flowers class
        flower1.bloom();
        flower1.grow();
        flower1.smell();

        System.out.println("Creating second object of the Flower class");
        Flower flower2=new Flower();
        flower2.name="Rose";
        flower2.color="blue";
        flower2.price=15;
        flower2.price=18;
        System.out.println(flower2.price);
        System.out.println(flower2.pretty);

        flower2.bloom();
        flower2.grow();
        flower2.smell();

        System.out.println("Creating third object of the Flower class");
        Flower flower3=new Flower();
        flower3.name="Tulip";
        flower3.color="white";
        flower3.price=10;


        for (int i = 0; i <=3; i++) {
            System.out.println(i);
        }
       // System.out.println(i); error because i is local variable
    }
}
