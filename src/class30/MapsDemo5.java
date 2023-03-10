package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1, "Nezir");
        studentsMap.put(2, "Anush");
        studentsMap.put(3, "Tami");
        studentsMap.put(4, "Aisha");
        studentsMap.put(5, "Gul");
        studentsMap.put(6, "Bahar");
        studentsMap.put(7, "Saba");

        // remove all the keys from above map if they are greater than 2
        Collection<Integer> allKeys=studentsMap.keySet();
        System.out.println(allKeys);

        allKeys.removeIf(a-> a>2);
        System.out.println(allKeys);
        System.out.println(studentsMap);

    }
}
