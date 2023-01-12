package class3;

public class VariablesDemo1 {
    public static void main(String[] args) {
        int age=10; // requesting the computer to create a box of type int and store a value 10 in it
        int salary; // only create a boc of type int and don't assign any value to it
       salary=120000; // updating a variable or reassigning a value
        System.out.println(salary);
        /* String name;
        String city;
        String country;
         */
        String name,city,country; // we can create multiple empty boxes of a single line of code
        char gender,letter;
        name="Daria"; // storing a value in the variable
        System.out.println(name);
        //System.out.println(city); I have not stored anything inside the city variable that's why java is confused
        // what to print
        System.out.println(name);
    }
}
