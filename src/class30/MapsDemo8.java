package class30;

import java.util.Map;
import java.util.TreeMap;

public class MapsDemo8 {
    public static void main(String[] args) {
        
        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.
         */

        Map<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Egypt", "Cairo");
        countries.put("France", "Paris");
        countries.put("Italy", "Rome");
        countries.put("Lebanon", "Beirut");

       // Set<Map.Entry<String, String>> entrySet = countries.entrySet();

        // var keyword replaces all data types
        var entrySet = countries.entrySet();
        System.out.println("Printing all values using Enhanced Loop");
        //for (Map.Entry<String, String> entry : entrySet) {
        // var replaces all data types
        for (var entry: entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (String country : countries.keySet()) {
            String capital = countries.get(country);
            System.out.println(country + " - " + capital);
        }

        System.out.println("Printing all values using Iterator");
        var iterator=countries.entrySet().iterator();
        while (iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
    }

