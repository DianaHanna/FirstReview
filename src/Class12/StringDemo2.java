package Class12;

public class StringDemo2 {
    public static void main(String[] args) {

        String str="JAVA is FUN 1135$%$"; // creating the object
        String newStr=str.toLowerCase(); // only converts the upper case letters to lower case
        System.out.println(newStr);

        String str2="i love java";
        String upperCaseLetter=str2.toUpperCase();
        System.out.println(upperCaseLetter);
    }
}
