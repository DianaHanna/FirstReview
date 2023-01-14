package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {

            if (i==3 || i==6 | i==9) {
                continue; // skip keyword
            }
                System.out.println(i); // line is never executed when i=3,6,9

            }
        }
    }

