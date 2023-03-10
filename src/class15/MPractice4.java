package class15;

public class MPractice4 {

    /*
    create a method that takes two numbers as a parameters and return the larger number
     */
    // return type int
    // name largerNum
    // parameters int number1, int number2

    int largerNum(int number1, int number2){
        int largest=0;
        if (number1>number2){
            return number1;
        }else{
            return number2;
        }
    }

    public static void main(String[] args) {
        MPractice4 mPractice4=new MPractice4();

        System.out.println(mPractice4.largerNum(12,13));
    }
}
