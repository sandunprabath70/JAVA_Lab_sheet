
package com.mycompany.employee;


public class TestEmployee
{
    public static void main(String[] args) 
    {
      
        Employee emp = new Employee("Bogdan", 30, 50000.0);

      
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}

