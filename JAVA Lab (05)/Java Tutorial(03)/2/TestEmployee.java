
package com.mycompany.employee;


public class TestEmployee {
    public static void main(String[] args) {
        // Creating an Employee object with the constructor and passing values
        Employee emp = new Employee("Bogdan", 50000, 10000);

        // Getting values using getters
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("Bonus Amount: " + emp.calculateBonusAmount());
    }
}

