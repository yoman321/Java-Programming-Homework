/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg4;

/**
 *
 * @author luoph
 */
import java.util.Scanner;
import static java.lang.System.out;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Import the Scanner;
        Scanner input = new Scanner(System.in);
        
        //Create the array.
        double[] gradesArray = new double[100];
        
        //Tell the user the point of this program.
        out.println("This program is made to have grades inputed and have "
                + " them compared to the average of those grades.\n");
        
        //Ask the user for the inputs.
        out.print("Please input the grades : ");
        int inputGrade = input.nextInt();
        
        //Ask the user to input the grades with a for loop.
        for (int locationInArray=0; locationInArray<gradesArray.length; locationInArray++){
            //Create an if statement to determine when to end the program.
            if (inputGrade >= 0){
                //Allocate the inputed grade to an array index.
                gradesArray[locationInArray] = inputGrade;
                //Re-ask for an input from the user.
                inputGrade = input.nextInt();
            }
            else
                gradesArray[locationInArray] = inputGrade;
                
                
        }
        //Call a method to determine the average.
        double average = determineAverage(gradesArray);
        
        //Call a void method to print out the result.
        displayAboveOrBelowAverage(average, gradesArray);
        
        
    }
    //Create a void method to find whether the grade is above or below the average and print out the result.
    public static void displayAboveOrBelowAverage (double average, double gradesArray[]){
        
        //Create the result for above abverage grades statement.
        out.print("The grades that are above the average are : ");
        
        //Create a for loop to compare everything from the gradesArray to the average.
        for (int gradesLocationInArray=0; gradesLocationInArray<gradesArray.length; gradesLocationInArray++){
            //Create a nested if statement to know when to stop the loop and when to print the numbers.
            if (gradesArray[gradesLocationInArray] >= 0){
                if (gradesArray[gradesLocationInArray] > average){
                    out.printf("%.0f ", gradesArray[gradesLocationInArray]);
                }
            }
        
        }
        //Skip to the next line.
        out.println();
        
        //Create a statement for the below average grades.
        out.print("The grades that are below averages are : ");
        
        //Create another loop to compare everything from the gradesArray to the average.
        for (int i=0; i<gradesArray.length; i++){
            //Create a nested if statement to know whether to stop the loop of print out numbers.
            if (gradesArray[i] >= 0){
                if (gradesArray[i] < average){
                    out.printf("%.0f ",gradesArray[i]);
                }
            }
        }
    }
    //Create a method to get an average of the grades.
    public static double determineAverage (double[] gradesArray){
        
       //Create the variables.
       double average = 0;
       double sum = 0;
       double divisor = 0;
       
       //Create another array in this method.
       double[] averageArray = new double[100];
       
       //Copy the graesArray to averageArray.
       System.arraycopy(gradesArray, 0, averageArray, 0, gradesArray.length);
       
       //Create a loop to get the average.
       for (int locationInArrayAverage=0; locationInArrayAverage<averageArray.length; 
                locationInArrayAverage++){
           //Create an if statement to know when to stop summing up and increase the divisor.
           if (averageArray[locationInArrayAverage] >= 0){
               sum += averageArray[locationInArrayAverage];
               divisor ++;
           }
       }
       //Create the return statement.
       average = sum / divisor;
       return average;
    }
}
