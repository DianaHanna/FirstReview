package class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {

        // Doesn't allow duplications and retains the insertion order
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        System.out.println(numbers);

        // write some logic to remove duplicate elements from the above list
        LinkedHashSet<Integer> uniqueNumbers=new LinkedHashSet<>();
        System.out.println(uniqueNumbers);

    }
}