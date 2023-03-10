package class15;

public class MPractice3 {

    /*
    create a method that takes an array of int sum all the elements from the array
    and return the sum
     */
    // return type int
    // method name Arraysum
    // parameter int[] arr

    int arraySum(int []arr) {
        int[] arr1 = {10, 20, 30};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    }

