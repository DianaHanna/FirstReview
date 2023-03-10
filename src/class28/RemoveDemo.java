package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        // it doesn't work in java * and below
        var name="fehfuiehfiu";
        var c='s';
        var f=12.5;

        // it works from java 6 to java 19
        /*
        Iterator<String>iterator=words.iterator();
        while (iterator.hasNext()){
            String s= iterator.next();
            if (s.endsWith("a")){
                iterator.remove();
            }
        }

     */

        // doesn't work in java 7 and below
        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);

    }
}
