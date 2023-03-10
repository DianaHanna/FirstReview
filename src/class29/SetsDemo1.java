package class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetsDemo1 {
    public static void main(String[] args) {

        // HashSet doesn't allow duplicate values and it doesn't maintain insertion order
        HashSet<String> fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Mango");
        System.out.println(fruit);


    }
}
