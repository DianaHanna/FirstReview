package class3;

public class IfElse_9 {
    public static void main(String[] args) {

        char c='M';
        if(c=='M')
        {
            System.out.println("Male");
        }

        String name="Nat";
        // with non-primitive data types such as String we can't use == symbol we can use .equals()
        if(name.equals("Sam"))
        {
            System.out.println("Amazing student");
        }
        // ! symbol can change true to false and false to true
        if(!name.equals("Sam"))
        {
            System.out.println("Super amazing student");
        }
    }
}
