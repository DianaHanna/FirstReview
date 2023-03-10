package class16;

import static class16.Students.numberOfStudents;

public class StudentsTester {
    public static void main(String[] args) {

        Students students=new Students();
        students.name="Daniel";
        students.ID="D456";
        students.numberOfStudents++;

        Students students1=new Students();
        students1.name="Patrick";
        students1.ID="D587";
        students1.numberOfStudents++;

        Students students2=new Students();
        students2.name="Karim";
        students2.ID="D954";
        students2.numberOfStudents++;
        System.out.println(numberOfStudents);

        }

        }

