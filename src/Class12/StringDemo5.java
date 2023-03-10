package Class12;

public class StringDemo5 {
    public static void main(String[] args) {

        //input is String
        String str="Java";
        String str2="JAVA";

        // output is boolean
        boolean areEqual=str.equals(str2);
        System.out.println(areEqual);
        boolean areEqual2=str.equalsIgnoreCase(str2);
        System.out.println(areEqual2);
    }
}
