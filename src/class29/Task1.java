package class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
     //How can you remove all duplicates from ArrayList?
        System.out.println(aList);
        HashSet<String> aList2=new HashSet<>(aList);
        System.out.println(aList2);
        }
    }

