package class29;

import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {

        // Doesn't allow duplications and retains the insertion order
       TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(50);
        numbers.add(40);
        numbers.add(100);
        numbers.add(20);
        numbers.add(35);
        numbers.add(50);

        System.out.println(numbers);
    }
}
