package class16;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {

        SyntaxEmployee syntaxEmployee=new SyntaxEmployee();
        syntaxEmployee.empID="654845";
        syntaxEmployee.salary=15000;


        SyntaxEmployee syntaxEmployee1=new SyntaxEmployee();
        syntaxEmployee1.empID="9844545";
        syntaxEmployee1.salary=18000;

        System.out.println(syntaxEmployee.empID);
        System.out.println(syntaxEmployee.salary);
        System.out.println(syntaxEmployee.CEO);
        System.out.println(syntaxEmployee1.empID);
        System.out.println(syntaxEmployee1.salary);
        System.out.println(syntaxEmployee1.CEO);
    }
}
