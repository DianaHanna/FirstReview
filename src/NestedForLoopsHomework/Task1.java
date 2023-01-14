package NestedForLoopsHomework;

public class Task1 {
    public static void main(String[] args) {

        for (int i = 1; i <=50 ; i++) {
            if (i%3==0){
                continue;
            }
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
