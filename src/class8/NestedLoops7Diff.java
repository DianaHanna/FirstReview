package class8;

public class NestedLoops7Diff {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 6; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}