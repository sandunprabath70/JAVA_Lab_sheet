

package com.mycompany.employee;


public class Employee {
    private String empName;
    private double basicSalary;
    private double bonus;

    // Constructor with parameters to set Name, Basic Salary, and Bonus
    public Employee(String empName, double basicSalary, double bonus) {
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Getter and Setter for Employee Name
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter and Setter for Basic Salary
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Getter and Setter for Bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Method to calculate the Bonus Amount
    public double calculateBonusAmount() {
        return basicSalary + bonus;
    }
}

