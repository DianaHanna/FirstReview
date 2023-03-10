package class20;

public class Child1 extends Parent{

    public static void main(String[] args) {

        Child1 child1=new Child1();
        child1.hello();
        child1.bye();
        Parent.bye();
        Child1.bye();
        //child1.money(); not accessible because it's private access


        child1.name="Daniel";
        Child1.lastName="Abdelshahid"; // accessible by class name since it's static
    }
}
