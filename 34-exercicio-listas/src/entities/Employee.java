package entities;

import application.Main;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;

    //Builder


    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //Getter and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Methods
    public void addSalary(double addSalary) {
        salary = salary + (salary * addSalary) / 100;
    }

    public static Integer idPosition(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public String toString() {
        return id + ", " + name + ", " + salary;
    }

}
