
package com.mycompany.person;

public class TestPerson 
{
    public static void main(String[] args)
    {
        
        Student student = new Student();
        student.setName("sandun");
        student.setId(10301);
        student.setCourse("Computer and Science");

        
        Lecturer lecturer = new Lecturer();
        lecturer.setName("prabath");
        lecturer.setId(20301);
        lecturer.setProgramme("Data and Science");

        
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Course: " + student.getCourse());

        System.out.println("\nLecturer Details:");
        System.out.println("Name: " + lecturer.getName());
        System.out.println("ID: " + lecturer.getId());
        System.out.println("Programme: " + lecturer.getProgramme());
    }
}
