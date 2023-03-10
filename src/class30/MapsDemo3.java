package class30;

import java.util.HashMap;

public class MapsDemo3 {
    public static void main(String[] args) {

        /*
        Create a map of a building. Store floor number and it is associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
       Remove company on the 7th floor
       Print your map
         */

        HashMap<Integer, String> building=new HashMap<>();
        building.put(1,"Syntax");
        building.put(2,"Google");
        building.put(3,"Microsoft");
        building.put(4,"GE");
        building.put(5,"Deloitte");
        building.put(6,"Apple");
        building.put(7,"Samsung");

        System.out.println(building.size());
        building.replace(4,"CarPark");
        building.remove(7);
        System.out.println(building);
    }
}
