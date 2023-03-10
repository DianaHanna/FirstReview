package class17;

public class Task3 {
    public static void main(String[] args) {

        // return type String
        // name onlyVowels
        // parameter String
        System.out.println(getOnlyVowels("Java"));
    }

    private static String getOnlyVowels(String inputStr){
        // AEIOUY aeiouy vowels
        return inputStr.replaceAll("[^AEIOUYaeiouy]","");
    }

}
