package class30;

import java.util.HashMap;
import java.util.HashSet;

public class MapsDemo2 {
    public static void main(String[] args) {

        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple", 1.99); // value of apple has been changed to second value because Maps don't allow duplication
        fruit.put("Orange", 2.99);
        fruit.put("Banana", 4.99);
        fruit.put("Kiwi", 0.99);
        fruit.put("Apple", 3.99);
        fruit.put(null,null);
        System.out.println(fruit);

        HashMap<String, Double> makeup=new HashMap<>();
        makeup.put("Lipstick", 50.00);
        makeup.put("Foundation", 40.00);
        makeup.put("Mascara", 70.00);
        makeup.put("Eyeliner", 12.2);
        makeup.put("Blusher", 12.2);

        HashMap<String, Double> groceries=new HashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(makeup);
        System.out.println(groceries);
    }
}
