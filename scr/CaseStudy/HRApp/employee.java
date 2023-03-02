package scr.CaseStudy.HRApp;

public class employee {

    private int id;
    private String name;
    private String surname;
    private double salary;

    // ========= ID =========

    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }

    // ========= NAME =========

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    // ========= SALARY =========

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // ========= CONSTRUCTOR =========

    public employee(String name, String surname, double salary) {
        setId(app.idCount);
        app.idCount++;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    // ========= TOSTRING =========

    @Override
    public String toString() {
        return "\nemployee [ID = " + id + " - NAME = " + surname + ", " + name + " - SALARY = $" + salary + "]";
    }
    
}
