package Review11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {
    public static void main(String[] args) {

        Map<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple", 12.5);
        fruitMap.put("Banana", 4.9);
        fruitMap.put("Dragon Fruit", 5.6);
        fruitMap.put("Pear", 16.5);
        fruitMap.put("Orange", 15.5);
        fruitMap.put("Mango", 10.6);

        var entrySet=fruitMap.entrySet();
        for (var entry :entrySet) {
            String fruitName = entry.getKey();
            Double fruitPrice = entry.getValue();
            if ((fruitName.contains("a") || fruitName.contains("e")) && fruitPrice > 8.0) {
                System.out.println(fruitName + " " + fruitPrice);
            }
        }
    }
}
