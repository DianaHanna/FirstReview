package Review8;

public class Store {
    public static void main(String[] args) {

        Furniture chair=new Chair();
        chair.assemble();
        chair.comfort(); // runtime polymorphism dynamic
        // proof that method breaks is nor overridden

        Furniture table=new Table();
        table.assemble();
        table.comfort(); // runtime polymorphism
        Table t=new Table();
        t.assemble();
        t.comfort();
        t.buildTable("Wood");

        // availability of methods based on the class nad execution of cos=de based on the object

        Chair.breaks();
        Furniture.breaks();

    }
}
