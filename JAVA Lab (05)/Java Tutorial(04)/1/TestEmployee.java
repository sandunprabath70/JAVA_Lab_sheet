
package com.mycompany.employee;

public class TestEmployee
{
    public static void main(String[] args) 
    {
        
        Employee bogdan = new Employee();
        Employee bird = new Employee();

       
        bogdan.setEmpID(1001);
        bogdan.setEmpName("Bogdan");
        bogdan.setEmpDesignation("Software Engineer");

        
        bird.setEmpID(1002);
        bird.setEmpName("Bird");
        bird.setEmpDesignation("HR Manager");

       
        System.out.println("The Employee ID: " + bogdan.getEmpID());
        System.out.println("The Employee Name: " + bogdan.getEmpName());
        System.out.println("The Employee Designation: " + bogdan.getEmpDesignation());

        System.out.println("\nThe Employee ID: " + bird.getEmpID());
        System.out.println("The Employee Name: " + bird.getEmpName());
        System.out.println("The Employee Designation: " + bird.getEmpDesignation());
    }
}

