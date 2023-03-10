package class28;

import class26.Dog;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>(); // generic array
        names.add("10");

        Object a=new String("Some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);

        // no one now uses the array like this
        ArrayList name=new ArrayList(); // non-generic arrayList
        name.add("Ehsan");
        name.add(10);
        name.add('a');
        name.add(new Dog("Jacky", "Green","Unknown"));
        for (Object j:name) {
            System.out.println(j);
            ((String)j).trim();
        }
    }
}
