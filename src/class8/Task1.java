package class8;

public class Task1 {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;

        while (summer){

            if (temp<=100){
                System.out.println("I love summer because temperature is "+temp);

            }else {
                System.out.println("It's very hot "+temp);
summer=false;
            }
            temp+=5;
        }

        int temp2=75;

        while (temp2<=105){
            if (temp2<=100){
                System.out.println("I love summer because temperature is "+temp);
            }else {
                System.out.println("It's very hot "+temp2);
            }
            temp2+=5;
        }
    }
}
