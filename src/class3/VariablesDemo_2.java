package class3;

public class VariablesDemo_2 {
    public static void main(String[] args) {
        int age=10;
        /*
        To rename something right click, refactor / rename
         */
        System.out.println(age);
        age=20;
        System.out.println(age);
        int number=10;
        age=number; // I am saying to java replace the value of age with the value of number variable
        System.out.println(age);
        age=number+10;
        System.out.println(age);
        age=age+20; //
        System.out.println(age);
    }
}
