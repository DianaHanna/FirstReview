package Review10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AllElementsFromSet {
    public static void main(String[] args) {

        Set<String> qaJobs=new LinkedHashSet<>(); // doesn't maintain the order
        // adding objects/elements to the collection
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api Tester");
        qaJobs.add("Database Tester");
        System.out.println(qaJobs);

        //how to get all values from a Set
        // 1- enhanced for loop
        for (String qa:qaJobs) {

            System.out.print(qa+" ");
        }

        System.out.println("---------------------------------");
        // 2- iterator
        //  Iterator interface has 3 methods: hasNext(0, next(), remove();
        qaJobs.remove("QA Analyst");
        Iterator<String> it=qaJobs.iterator();
        while (it.hasNext()){
        String element=it.next();
        System.out.print(element+" ");
    }
}
}

