package class10;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int[] arr={10,20,30,40,50};
        System.out.println(arr[4]);
        // can you print 2 numbers from an array
        System.out.println(arr[1]+" "+arr[4]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("*********************");
        // Enhanced foreach for loop
        // whenever possible use below loop
        for (int number:arr) {
            System.out.println(number);
        }
    }
}
