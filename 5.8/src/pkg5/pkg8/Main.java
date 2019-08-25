/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg8;

/**
 *
 * @author Utilisateur
 */
import java.util.Scanner;
public class Main {

    /*(Find the highest score) Write a program that prompts the user to enter 
    the number of students and each student’s name and score, and finally displays 
    the name of the student with the highest score. */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Enable the use of the Scanner.
        Scanner input = new Scanner(System.in);
        
        //Set up variables.
        String HIGHEST_NAME = "";
        double HIGHEST_SCORE = 0;
        
        //Tell the user what the program can do and its instructiojns.
        System.out.println("This program is made to receive student's name and grades."
                + "It compares them and find the students that had the highest grade.");
        
        System.out.println("First enter the number of students whose data would be entered"
                + "in this program.");
        
        //Set the input values.
        int NUMBER_OF_STUDENTS = input.nextInt();
        
        //Set the loop to tell the user to input the names and scores.
        System.out.println("Enter the student's names and grades.");
        
        for (int i=1;i<=NUMBER_OF_STUDENTS;i++){
            
            String name = input.next();
            double score = input.nextDouble();
            
            /*
            Set the if statement stating that if the inputed score is bigger
            than the actual highest score, the name and score shall be changed.
            */
            if (HIGHEST_SCORE<score){
                
                HIGHEST_SCORE = score;
                HIGHEST_NAME = name;
            }
            
            
        }
        //Create the final output statement.
        System.out.printf("The student who had the highest score is %s with a score of %.1f", HIGHEST_NAME, HIGHEST_SCORE);
    }
    
}
