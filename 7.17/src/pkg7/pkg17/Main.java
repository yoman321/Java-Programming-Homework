/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg17;

/**
 *
 * @author luoph
 */
import java.util.Scanner;
import static java.lang.System.out;
import java.util.Arrays;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Import the Scanner.
        Scanner input = new Scanner (System.in);
        
        //Create the arrays.
        double[] scores;
        String[] names;
        
        //Tell the user the point of the program.
        out.println("This program is made to display students scores in "
                + "decreasing order.");
        
        //Ask the user for the number of students.
        out.print("Please input the number of students : ");
        final int NUMBER_OF_STUDENTS = input.nextInt();
        
        //Set the length for the arrays.
        scores = new double[NUMBER_OF_STUDENTS];
        names = new String[NUMBER_OF_STUDENTS];
        
        //Ask the user to enter the name and score for each student.
        out.print("Please input the student's name and scores : ");
        for (int index=0; index<scores.length; index++){
            names[index] = input.next();
            scores[index] = input.nextDouble();
            
        }
        //Compare students grades to each other.
        for (int index=0; index<scores.length; index++){
            double scoreTemp = 0;
            String nameTemp = "";
            
            for (int indexBack=scores.length-1; indexBack>index; indexBack--){
                if (scores[index] < scores[indexBack]){
                    scoreTemp = scores[index];
                    scores[index] = scores[indexBack];
                    scores[indexBack] = scoreTemp;
                    
                    nameTemp = names[index];
                    names[index] = names[indexBack];
                    names[indexBack] = nameTemp;
                }
            }
        }
        //Call a void method to print the result.
        printGrades(names, scores);
    }
    //Create a void method to print out the arrays.
    public static void printGrades (String[] namesArray, double[] scoresArray){
        
        out.println("The students grades in decreasing orders are : ");
        
        for (int index=0; index<scoresArray.length; index++){
           out.print(namesArray[index]+" , "+scoresArray[index]+"\n"); 
        }
    }
}