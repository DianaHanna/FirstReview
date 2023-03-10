package class30;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo9 {
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

        System.out.println("Printing all values using Enhanced Loop");
        var values=countries.values();
        for (var value:values) {
            System.out.println(value);
        }

        System.out.println("Printing all values using Iterator");
        var iterator=countries.values().iterator();
        while (iterator.hasNext()){
            var value=iterator.next();
            System.out.println(value);
        }
    }
    }

