package scr.CaseStudy.HRApp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class department implements Serializable {

    private String departName;
    private employee[] employees = new employee[10];

    // ========= ADD EMPLOYEES =========

    public void addEmployee(employee emp) {
        ArrayList<employee> temp = new ArrayList<employee>();
        temp.add(emp);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = temp.get(0);
                break;
            }
        }
    }

    public void addEmployeePack() {
        ArrayList<employee> temp = new ArrayList<employee>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Register " + (i + 1) + " / " + employees.length);
            System.out.print("Insert a name: ");
            String name = scan.next();
            System.out.print("Insert a surname: ");
            String surname = scan.next();
            System.out.print("Insert a salary: ");
            double salary = scan.nextInt();
            temp.add(new employee(name, surname, salary));
            System.out.print("\n");
        }
        scan.close();
        for (int i = 0; i < temp.size(); i++) {
            employees[i] = temp.get(i);
        }
    }

    // ========= TOTAL OF EMPLOYEES =========

    public Integer departmentEmployees() {
        return employees.length;
    }

    // ========= EMPLOYEE BY ID =========

    public void employeeID(int i) {
        for (employee employee : employees) {
            if (employee.getId() == i)
                System.out.println(employee);
                break;
        }
    }

    // ========= TOTAL SALARY OF ALL EMPLOYEES FROM THIS DEPARTMENT =========

    public double departmentSalary() {
        double salary = 0.0;
        for (employee employee : employees) {
            salary += employee.getSalary();
        }
        return salary;
    }

    // ========= AVERAGE SALARY OF EMPLOYEES FROM THIS DEPARTMENT =========

    public double averageSalary() {
        return (departmentSalary() / employees.length);
    }

    // ========= DEPARTMENT NAME =========

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    // ========= CONSTRUCTOR =========

    public department(String departName) {
        this.departName = departName;
    }

    // ========= TOSTRING =========

    @Override
    public String toString() {
        return "DEPARTMENT " + departName + " ENPLOYEES " + Arrays.toString(employees);
    }

}
