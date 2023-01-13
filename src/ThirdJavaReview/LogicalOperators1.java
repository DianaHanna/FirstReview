package ThirdJavaReview;

public class LogicalOperators1 {
    public static void main(String[] args) {


        boolean loginButtonDisplayed=true;

        boolean loginButtonClickable=false;

        if (loginButtonDisplayed && loginButtonClickable){
            System.out.println("Test case is passed");
        }else {
            System.out.println("Test case is failed");
        }


        System.out.println("******************LOGICAL OR***********************");

        boolean dashboard=false;
        String message = "Welcome admin";

        if (dashboard || message.equals("Welcome Admin")){
            System.out.println("User is successfully logged in");
        }else{
            System.out.println("User is NOT logged in");
        }

        System.out.println("**************LOGICAL NOT****************");

        boolean b=true;
        System.out.println(!true);


        boolean agreeCheckBoxSelected=true;
        if (!agreeCheckBoxSelected){
            System.out.println("I am clicking on checkbox");
        }
        System.out.println("I am clicking on submit button");
    }
}
