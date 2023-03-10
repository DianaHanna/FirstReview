package class16;

public class Task7 {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */
    // return int
    // name arrSum
    // parameter int [] arr

    int arrSum(int[] arr){ // if we add static we don't need to create the object
        int sum=0;
        for (int num:arr) {
            sum+=num;
        }
        return sum;


    }

    public static void main(String[] args) {

      int []arr={10,25,35,45};
       Task7 task7=new Task7();
        System.out.println(task7.arrSum(arr));
    }
}
