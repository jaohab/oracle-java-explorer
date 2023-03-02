package scr.CaseStudy.HRApp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class department implements Serializable {

    private employee[] employees = new employee[10];

    // ========= ADD EMPLOYEES =========

    public void addEmployee() {
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

    // method to return number of employees

    public Integer departmentEmployees() {
        return employees.length;
    }

    // method to return employee based on thir id number

    public void employeeID(int i) {
        for (employee employee : employees) {
            if (employee.getId() == i) 
            System.out.println(employee);
        }
    }

    // ========= TOTAL SALARY OF ALL EMPLOYEES FROM THIS DEPARTMENT =========

    public double departmentSalary() {
        double salary = 0.0;
        for (employee employee : employees) {
            salary = salary + employee.getSalary();
        }
        return salary;
    }

    // ========= AVERAGE SALARY OF EMPLOYEES FROM THIS DEPARTMENT =========

    public double averageSalary() {
        double salary = 0.0;
        for (employee employee : employees) {
            salary = salary + employee.getSalary();
        }
        return (salary / employees.length);
    }

    // ========= TOSTRING =========

    @Override
    public String toString() {
        return "DEPARTMENT ENPLOYEES " + Arrays.toString(employees);
    }

}
