package homeWork2;

public class CreditCard {
    public static void main(String[] args) {

        boolean creditCard=false;
        int balance=2000;

        if (creditCard){
            System.out.println("What is the balance?");
        }else{
            System.out.println(" Would you like to open one?");
        }
        if (balance>=1000){
            System.out.println("Pay the balance off immediately");
        }else{
            System.out.println("You can spend more");
        }
    }
}
