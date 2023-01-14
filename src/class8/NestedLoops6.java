package class8;

public class NestedLoops6 {
    public static void main(String[] args) {

        for (int i = 1; i <4; i++) { // executes the below code 3 times (vertical)

            for (int j = 1; j < 6; j++) {
                System.out.print(j + " "); // prints the value of j from 1 to 5 (horizontal)
            }
            System.out.println();
        }


    }
}