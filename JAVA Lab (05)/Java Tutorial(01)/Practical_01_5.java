
package com.mycompany.practical_01_5;


public class Practical_01_5 
{

    public static void main(String[] args)
    {
         char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
        //output
        //Your grade is A
    }
}
