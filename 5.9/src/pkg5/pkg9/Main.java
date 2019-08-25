/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg9;

/**
 *
 * @author Utilisateur
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        (Find the two highest scores) Write a program that prompts the user to enter the
        number of students and each student’s name and score, and finally displays the
        student with the highest score and the student with the second-highest score.
        */
        
        //Create the scanner.\
        Scanner input = new Scanner(System.in);
        
        //Tell the user what this program is made for.
        System.out.println("This program is made to receive a number of students."
                + "Then, the student's name and grades shall be computed to be able "
                + "to determine who has the best and second best grades.\n");
        
        //Create the variables for the best anbd second best grades.
        String HIGHEST_NAME = " ";
        String CURRENT_NAME = " "; 
        String SECOND_NAME = " ";
        double HIGHEST_GRADE = 0;
        double CURRENT_HIGHEST = 0;
        double SECOND_GRADE = 0;
        
        //Tell the user to input the number of students.
        System.out.println("Please enter the number of students which the program would compare.");
        
        //Create the variables for the number of students.
        int NUMBER_OF_STUDENTS = input.nextInt();
        
        //Tell the user to now input the data.
        System.out.println("Please input the student's names and grades.");
        
        //Create the loop in which the student's names and grades woiuld be compare.
        for (int i=0;i<NUMBER_OF_STUDENTS;i++){
            
            String name = input.next();
            double grade = input.nextDouble();
            
            /*
            Create the else if statement to determine who has the best and second best
            grades.
            */
            if (HIGHEST_GRADE<grade){
                
                CURRENT_HIGHEST = HIGHEST_GRADE;
                HIGHEST_GRADE = grade;
                SECOND_GRADE = CURRENT_HIGHEST;
                
                CURRENT_NAME = HIGHEST_NAME;
                HIGHEST_NAME = name;
                SECOND_NAME = CURRENT_NAME;
                
                
            }
                    
        }
        //Display the results of the program.
        System.out.printf("The student with the highest grade is %s with a grade of %.1f\n", HIGHEST_NAME, HIGHEST_GRADE);
        System.out.printf ("the student with the second highest grade is %s with a grade of %.1f", SECOND_NAME, SECOND_GRADE);
    }
    
}
