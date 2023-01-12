package class6;

public class whileRecap {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);



        int number=10;
        while (number<20){
            System.out.println(number<20);
            if (number<15){
                System.out.println("Number is still less than 15");
            }else {
                System.out.println("Number is greater than 15 now");
            }
            System.out.println(number);
            number++;
        }
    }
}
