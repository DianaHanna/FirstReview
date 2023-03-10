package class16;

public class PersonTester {
    public static void main(String[] args) {

        Person person=new Person();
        // System.out.println(person.bankBalance); error because it's private
        System.out.println(person.address);
        System.out.println(person.name);
        person.printTikTokAccount();
        person.printSSN();



    }
}
