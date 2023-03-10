package class28;

import java.util.ArrayList;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {

        // LinkedList=> 373 ms
        // ArrayList=> 160582 ms

        long startTime=System.currentTimeMillis();
        ArrayList<String> numbers=new ArrayList<>();
        for (int i = 0; i <100000 ; i++) {
            numbers.add(0,"Test Data");

        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
