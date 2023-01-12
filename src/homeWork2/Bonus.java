package homeWork2;

public class Bonus {
    public static void main(String[] args) {

        int workedYears=2;
        long salary=30000;

        if ((workedYears>=5) && (salary>=50000)) {
            System.out.println("User is eligible for the bonus");
            System.out.println(" Bonus is 5000");
        }else{
            System.out.println("User is NOT eligible for the bonus");
            System.out.println("Bonus is 3000");
        }
    }
}
