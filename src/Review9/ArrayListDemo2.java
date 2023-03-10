package Review9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        List<String> computers=new ArrayList<>();
        computers.add("Macbook Pro");
        computers.add("HP");
        computers.add("Lenovo");
        computers.add("Dell");
        System.out.println(computers);

        for (int i = 0; i < computers.size() ; i++) {
            String computer=computers.get(i);
            System.out.println(computer+" ");
        }
        for (String computer:computers) {
            System.out.println(computer+" ");
        }
        }
    }

