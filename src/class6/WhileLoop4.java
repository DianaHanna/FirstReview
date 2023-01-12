package class6;

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {

        int number=1;
        int sum=0;
        while (number<=5){
            sum=sum+number;
            number++;
        }
        System.out.println(sum);
    }
}
