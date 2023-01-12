package Replit;

import java.util.Scanner;

public class replit036 {
    public static void main(String[] args) {
        System.out.println("word1");
        Scanner scan = new Scanner(System.in);
        String word1 = scan.nextLine();
        System.out.println("word2");
        String word2 = scan.nextLine();
        System.out.println("int1");
        int int1 = scan.nextInt();
        System.out.println("int2");
        int int2 = scan.nextInt();
        if (int1==int2 && word1.equals(word2)){
            System.out.println("AND");
        } else if (int1==int2 || word1.equals(word2)) {
            System.out.println("OR");
        } else if (int1!=int2 && !word1.equals(word2)) {
            System.out.println("NONE");

        }
    }
}
