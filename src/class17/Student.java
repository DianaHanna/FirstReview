package class17;

public class Student {

    String name;
    int age;
    double weight;
    String id;

    Student(String studentName, int studentAge, double studentWeight, String studentId){
        name=studentName;
        age=studentAge;
        weight=studentWeight;
        id=studentId;
    }

    void printInfo(){
        System.out.println("Name "+name+" age "+age+" Weight "+weight+" Id "+id);
    }
}
