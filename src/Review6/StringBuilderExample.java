package Review6;

public class StringBuilderExample {
    public static void main(String[] args) {

        // this class i mutable collection of characters
        StringBuilder sb=new StringBuilder("Hello");

        // all changes happen on the same object
        sb.reverse(); // proves that StringBuilder is mutable

        System.out.println(sb); // olleH

        String str=sb.toString();
        str.toUpperCase(); // proves that String is immutable
        System.out.println(str); //olleH
    }
}
