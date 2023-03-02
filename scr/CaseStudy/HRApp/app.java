package scr.CaseStudy.HRApp;

public class app {

    static int idCount = 1;
    public static void main(String[] args) {

        // 1 - print, the app's turn on

        System.out.println("\nWelcome to HR App\n");

        // 2 - create a new department

        department marketing = new department();

        // 3 - call toString info departmant

        System.out.println(marketing);

        // 4 - create a few employees to the department

        marketing.addEmployee();

        // 5 - locate employee by id

        marketing.employeeID(5);
        
        // 6 - get every employee in the department info

        System.out.println(marketing);

        // 7 - print total salary of the department

        System.out.println("TOTAL SALARY OF ALL EMPLOYEES FROM THIS DEPARTMENT - $" + marketing.departmentSalary());  

        // 8 - print average salary of the department

        System.out.println("AVERAGE SALARY OF EMPLOYEES FROM THIS DEPARTMENT - $" + marketing.averageSalary());
    }
    
}
