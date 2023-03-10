package Review10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {

        Set<String> qaJobs=new HashSet();
        // adding objects/elements to the collection
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api Tester");
        qaJobs.add("Database Tester");
        System.out.println(qaJobs);

        qaJobs.remove("Manual Tester");
        System.out.println("Removed an element "+qaJobs);
        qaJobs.add("Api Tester");
        qaJobs.add("Api Tester");

        System.out.println("Added duplicated "+qaJobs);

        // creating an Object and passing collection as a parameter to invoke parameterized constructor
        Set<String> lSet=new LinkedHashSet<>(qaJobs);
        /* Set<String> lSet=new LinkedHashSet(); // another way of doing it
        lSet.addAll(qaJobs);
         */

        System.out.println("LinkedHashSet= "+lSet);

        Set<String> tSet=new TreeSet<>();
        tSet.addAll(qaJobs);
        System.out.println("TreeSet= "+tSet);
    }
}
