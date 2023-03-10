package class16;

import javax.net.ssl.SNIServerName;

public class Student {

    String name;
    String id;
    static String schoolName;
    int age;
    double weight;


    void printName(){
        int SSN=1234566456;
        System.out.println(name);
        System.out.println(schoolName);
    }
    static void printStudentInfo(){
        // System.out.println(name); cannot be accessed here because it's local
        System.out.println(schoolName);
        // System.out.println(SSN); cannot be accessed here local
    }

}
