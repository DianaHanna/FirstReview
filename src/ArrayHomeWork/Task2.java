package ArrayHomeWork;

public class Task2 {
    public static void main(String[] args) {

        /*
        Create an array of names and store all names of your group. Then print your name from that array.
        (use 2 different ways of creating an array).
         */

        String[] names={"Diana","Rania","Peter","Safi","Olesea","Mohamed","Romanullah","Marian","Sarah"};

        System.out.println(names[0]);

        System.out.println("*******************************");

        String[]names1=new String[9];
        names1[0]="Olesea";
        names1[1]="Rania";
        names1[2]="Peter";
        names1[3]="Safi";
        names1[4]="Diana";
        names1[5]="Mohamed";
        names1[6]="Romanullah";
        names1[7]="Marian";
        names1[8]="Sarah";

        System.out.println(names1[4]);
    }
}
