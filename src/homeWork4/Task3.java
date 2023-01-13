package homeWork4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Enter quiz, mid term and final scores");
        Scanner scan = new Scanner(System.in);
        double quiz=scan.nextDouble();
        double midTerm=scan.nextDouble();
        double finalScore=scan.nextDouble();

        double average=(quiz+midTerm+finalScore)/3;
        if (average>=90){
            System.out.println("The grade is A");
        } else if (average>=70 && average<90) {
            System.out.println("The grade is B");
        } else if (average>=50 && average<70) {
            System.out.println("The grade is C");
        } else if (average<50) {
            System.out.println("The grade is F");
        }else {
            System.out.println("No grade");
        }

    }
}
