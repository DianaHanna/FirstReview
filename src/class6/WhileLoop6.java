package class6;

public class WhileLoop6 {
    public static void main(String[] args) {


        boolean condition = true;
        int number = 0;
        while (condition) {
            System.out.println("Hello world");
            if (number > 3){
                condition = false;}
            number++;
        }

    }
}