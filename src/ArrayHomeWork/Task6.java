package ArrayHomeWork;

public class Task6 {
    public static void main(String[] args) {

        /*
        Create an array of countries. While retrieving all values from an array print capital
        for each country choose any five countries.
         */

        String[] country={"Egypt","UAE","France","USA","Lebanon"};
        country[0]="Cairo";
        country[1]="Abu Dhabi";
        country[2]="Paris";
        country[3]="Washington,D.C";
        country[4]="Beirut";

        for (int i = 0; i < country.length; i++) {
            System.out.println(country[i]);
        }

    }
}
