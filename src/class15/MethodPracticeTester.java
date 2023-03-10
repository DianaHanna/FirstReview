package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodPractice methodpractice=new MethodPractice();
        boolean isEven=methodpractice.isEven(15);
        // in order to print the result we need to define the method

        System.out.println(isEven);

        // call isEven method for numbers 100 12 20
        boolean isEven1= methodpractice.isEven(100);
        System.out.println(isEven1);
        boolean isEven2=methodpractice.isEven(12);
        System.out.println(isEven1);
      boolean isEven3=methodpractice.isEven(20);
        System.out.println(isEven1);
    }
}
