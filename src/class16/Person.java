package class16;

public class Person {

    private double bankBalance=1250000; // private cannot be accessed outside of this class
    String address="Street 123"; // default access
    public String name="Jon Snow"; // can be accessed from any other class in any package within the project

      private void printPhonePassword(){
       System.out.println("pass123");
    }

    void printSSN(){
        System.out.println("12345678");
    }

    void printTikTokAccount(){
        System.out.println("user123");
    }
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
        person.printSSN();
        person.printPhonePassword();
        person.printTikTokAccount();

    }
}