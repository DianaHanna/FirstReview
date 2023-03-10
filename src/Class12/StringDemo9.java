package Class12;

import javax.swing.plaf.IconUIResource;

public class StringDemo9 {
    public static void main(String[] args) {

        String str = "jfkfrjgrgh 56545 @#$%";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isAlphabetic(str.charAt(i))){
            count++;

            }
        }
        System.out.println("Total isAlphabetic in Str "+count);

    }
}
