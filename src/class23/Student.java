package class23;

public class Student {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
   Define common behavior within parent class and override some methods in child classes
   Define some methods specific to child classes
   Write example of achieving run time polymorphism
     */
    void study(){
        System.out.println("Student study a lot");
    }
    void experience(){
        System.out.println("Have some experience");
    }
}
class SyntaxStudent extends Student{
    @Override
    void study(){
        System.out.println("Student study Java");
    }
    void experience(){
        System.out.println("Have some experience maybe");
    }
    void schoolName(){
        System.out.println("Syntax");
    }
}
class CollegeStudent extends Student {
    @Override
    void study() {
        System.out.println("Student study Medicine");
    }
    void experience(){
        System.out.println("Have some experience for sure");
    }
    void SchoolName(){
        System.out.println("UNC");
    }
}
class SchoolStudent extends Student {
    @Override
    void study() {
        System.out.println("Student study Math");
    }
    void SchoolName(){
        System.out.println("Creek elementary");
    }
}

