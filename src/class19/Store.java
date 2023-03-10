package class19;

public class Store {
    public static void main(String[] args) {

        Furniture table=new Furniture("Table",100,"White"); // new keyword creates the object
        table.printInfo();

        Furniture chair=new Furniture("Chair",30,"Brown");
        chair.printInfo();
    }
}
