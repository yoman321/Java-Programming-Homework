/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg1;

/**
 *
 * @author Utilisateur
 */
import java.util.Scanner;
import static java.lang.System.out;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Import the Scanner.
        Scanner input = new Scanner(System.in);
       
        //Tell the user the point of this program.
        out.println("This program is made to find the best grade and give grades to"
                + " others according to this one.\n");
        
        //Ask the user to enter the number grades that is going to be entered.
        out.print("Please enter the number of grades that is going to be inputed : ");
        int numberOfGrades = input.nextInt();
        
        //Create the array with the right length.
        int [] gradeList = new int[numberOfGrades];
        
        //Tell the user to input the grades and allow that with a for loop.
        out.print("Please input your grades : ");
        for (int gradeNumber=0; gradeNumber<numberOfGrades; gradeNumber++){
            gradeList[gradeNumber] = input.nextInt();
        }
        //Display the restult.
        for (int i=0; i<gradeList.length; i++){
             
            //Print out the restult using the compare to highest method.
            out.println("Students "+i+" score is "+compareToHighest(i, gradeList));
        }
    }
    //Create a method to find the the highest grade in the array.
    public static double findHighestGrade (int[] gradeList){
        
        //Create the variables.
        double max = gradeList[0];
        
        //Find the highest grade in the array.
        for (int i=0; i<gradeList.length; i++){
            
            //Create an if statement that would determine which variable is the highest.
            if (max<gradeList[i])
                max = gradeList[i];
    }
       
       return max; 
}
     //Create a method to compare the values to the highest grade.
     public static char compareToHighest (int i, int gradeList[]){
         
        //Create the variable.
        double bestGrade = findHighestGrade(gradeList);
        
        //Compare every grade to this grade.
        if (gradeList[i] == bestGrade){
            return 'A';
        }
        else if (gradeList[i]>=bestGrade-10 && gradeList[i]<bestGrade){
            return 'A';
        }
        else if (gradeList[i]>=bestGrade-20 && gradeList[i]<bestGrade){
            return 'B';
        }
        else if (gradeList[i]>=bestGrade-30 && gradeList[i]<bestGrade){
            return 'C';    
        }
        else if (gradeList[i]>=bestGrade-40 && gradeList[i]<bestGrade){
            return 'D';
        }
        else 
            return 'F';
    }
    
}
