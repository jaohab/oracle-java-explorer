package scr.CaseStudy.HRApp;

public class app {

    static int idCount = 1;

    public static void main(String[] args) {

        // 1 - print, the app's turn on

        System.out.println("\nWelcome to HR App\n");

        // 2 - create a new department

        department marketing = new department("Marketing");
        // department commercial = new department("Commercial");

        // 3 - call toString info departmant

        System.out.println(marketing);

        // 4 - create a few employees to the department

        employee emp01 = new employee("John", "Lemon", 20000.0);
        marketing.addEmployee(emp01);

        marketing.addEmployee(new employee("Paul", "Tron", 18600.0));
        marketing.addEmployee(new employee("Eric", "Hudson", 15700.0));
        marketing.addEmployee(new employee("Emerson", "Palmer", 17520.0));
        marketing.addEmployee(new employee("Daniel", "Lews", 9010.0));
        marketing.addEmployee(new employee("Larissa", "Smith", 4000.0));
        marketing.addEmployee(new employee("Gisele", "Coppola", 4890.0));
        marketing.addEmployee(new employee("Victor", "Franz", 4545.0));
        marketing.addEmployee(new employee("Sandra", "Lague", 7175.0));
        marketing.addEmployee(new employee("Sabrina", "Mahon", 17800.0));

        // commercial.addEmployeePack();

        // 5 - locate employee by id

        marketing.employeeID(5);

        // 6 - get every employee in the department info

        System.out.println(marketing);

        // 7 - print total salary of the department

        System.out.println("\nTOTAL SALARY OF ALL EMPLOYEES FROM THIS DEPARTMENT - $" + marketing.departmentSalary());

        // 8 - print average salary of the department

        System.out.println("\nAVERAGE SALARY OF EMPLOYEES FROM THIS DEPARTMENT - $" + marketing.averageSalary());
    }

}
