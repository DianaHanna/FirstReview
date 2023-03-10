package class21;

public class Calculator
{
    /*
    Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with
    specific arguments and observe result.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        // Call each overloaded method with specific arguments
        System.out.println(Calculator.add(1, 2));
        System.out.println(Calculator.add(1, 2, 3));
        System.out.println(Calculator.add(1, 2, 3, 4));
    }
}



