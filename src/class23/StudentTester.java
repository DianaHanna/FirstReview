package class23;

public class StudentTester {
    public static void main(String[] args) {

        Student[] schools={new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student school:schools) {
            school.study();
            school.experience();

        }
}
}
