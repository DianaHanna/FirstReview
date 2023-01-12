package class4;

public class IfElseConditionDemo4 {
    public static void main(String[] args) {
        int number1=10;
        int number2=10;

        if(number1==number2){
            System.out.println("Numbers are equal");
        }else if (number1>=number2){
            System.out.println("Number 1 is greater than number 2");
        }else if(number2>=number1){
            System.out.println("Number 2 is greater than number 1");
        }
    }
}
