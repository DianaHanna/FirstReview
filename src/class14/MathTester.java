package class14;

import java.util.Scanner;

public class MathTester {
    public static void main(String[] args) {

        Math math=new Math();
        math.addNumbers(10,10);
        math.multNumbers(5,2,4);
        /*Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

         */

        int result=math.sub(100,50);
        System.out.println(result);
    }
}
