package Review6;

public class StringMethods {

    public static void main(String[] args) {
        String str="Hello";

        System.out.println(str.length()); //5
        System.out.println(str.toUpperCase()); //HELLO
        System.out.println(str.charAt(1)); //e

        String newString=str.concat(" friends");
        System.out.println(newString);// Hello friends
        System.out.println(str); // we get Hello because we didn't store the new String immutable(non-changeable)
        str=str.toLowerCase();
        System.out.println(str); // hello

        // check if leangth of the String is more than 0
        System.out.println(str.isEmpty());

        String str1=" Review B15   ";
        // removes any leading or trailing white spaces(before and after)
        String newStr1=str1.trim();

        System.out.println(str1);
        System.out.println(newStr1);
    }

}
