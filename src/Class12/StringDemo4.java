package Class12;

public class StringDemo4 {
    public static void main(String[] args) {


        String str=" ";
        boolean isEmpty=str.isEmpty(); // same way
        System.out.println(str.isEmpty()); // output is boolean & doesn't read spaces
        System.out.println(str.isBlank()); // reads the space
    }
}
