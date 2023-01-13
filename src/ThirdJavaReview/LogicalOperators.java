package ThirdJavaReview;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean cold=true;
        boolean rain=true;

        /*
        AND
        true && false -> TRUE
        true && false -> FALSE
        false && true -> FALSE
        false && false -> FALSE
*/
        if (cold && rain){
            System.out.println("I will stay at home");
        }

        /*

       OR
       true || false -> TRUE
        true || false -> TRUE
        false || true -> TRUE
        false || false -> FALSE
        */
    }
}
