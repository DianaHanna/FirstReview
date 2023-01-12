package class4;

public class IfDemo1 {
    public static void main(String[] args) {

        int money = 15000;
        if (money > 1000) {
            System.out.println("Let's buy an Iphone");
        }
        if (money > 2000) {
            System.out.println("Let's also buy a Macbook");
        }

        boolean mothersDay = true;

        if (mothersDay) {
            System.out.println("Happy mother's day");
        }
        String name = "Diana";

        // equals method is only used for non-primitives "String"
        if (name.equals("Diana")) {
            System.out.println("I love football");
        }

        // ctrl+alt+l to format codes
    }
}
