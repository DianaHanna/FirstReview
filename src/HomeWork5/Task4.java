package HomeWork5;

public class Task4 {
    public static void main(String[] args) {


        boolean workDay = true;
        int day= 1;
        while (workDay) {
            System.out.println("I need a day off");
            if (day ==5){
                workDay = false;}
            day++;
            }
        System.out.println("I don't need a day off anymore");
        }

    }


