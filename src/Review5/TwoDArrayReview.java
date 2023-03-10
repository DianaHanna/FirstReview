package Review5;

public class TwoDArrayReview {
    public static void main(String[] args) {


        int[][] array = {
                {1, 2, 3}, // index 0
                {11, 12, 13},// index 1
                {20, 21, 22}, // index 2
                {100, 101} // index 3
        };
        // getting all values from 2D array using regular for loop
        for (int row = 0; row < array.length; row++) { // outer loop iterates over rows

            for (int col = 0; col < array[row].length; col++) { // iterates over each column (inner loop)

                // I want to print values only from odd rows
                if (row % 2 != 0) {
                    System.out.print(array[row][col] + " ");

                }

            }
            System.out.println();
        }
            System.out.println("********************************");
            int numberOfArrays = array.length;
            System.out.println(numberOfArrays);

            System.out.println("*************************************");
            int numberOfElements = array[0].length;
            System.out.println(numberOfElements);

            System.out.println("*******************************");
            int numberOfElementsIn4Array = array[3].length;
            System.out.println(numberOfElementsIn4Array);

            // access 21
            System.out.println(array[2][1]);

            // getting all values from 2D array

            for (int[] arr : array) { // iterate over arrays
                for (int num : arr) { // iterates over each element
                    if (num % 2 == 0) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
            }
        }
    }
