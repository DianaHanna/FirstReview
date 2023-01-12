package homeWork2;

public class Diploma {
    public static void main(String[] args) {

        boolean diploma=true;
        double gpa=4.5;

        if (diploma==true){
            System.out.println("Congratulations");
        }else{
            System.out.println("You should get a degree");
        }
        if (gpa>=3.5){
            System.out.println("You are eligible for scholarship");
        }else{
            System.out.println("You should have studied harder");
        }
    }
}
