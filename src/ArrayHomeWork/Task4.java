package ArrayHomeWork;

public class Task4 {
    public static void main(String[] args) {

        /*
        Create an array that can store names of cars and store 6 elements into it.
         Print all values from the array.
         */

        String[] carsNames=new String[6];
        carsNames[0]="VW";
        carsNames[1]="Toyota";
        carsNames[2]="Mercedes";
        carsNames[3]="Alfa Romeo";
        carsNames[4]="Maserati";
        carsNames[5]="Chevrolet";

        for (int i = 0; i <=5; i++) {
            System.out.println(carsNames[i]);
        }

    }
}
