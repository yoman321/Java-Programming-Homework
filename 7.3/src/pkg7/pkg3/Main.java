/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg3;

/**
 *
 * @author luoph
 */
import static java.lang.System.out;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Impor the scanner;
        Scanner input = new Scanner(System.in);
        
        //Create the intergers array.
        int[] integersArray = new int[100];
        
        //Create the variables.
        int integersCount = 0;
        
        //Tell the user the point of this program.
        out.println("This porgram is made to have integers inputed and read the occurence"
                + " of each of them. Consider as inputing 0 as ending this program.\n");
        
        //Ask the user to input the first integers.
        out.print("Please enter numbers : ");
        int integers = input.nextInt();
        
        //Ask for the following input with a while loop.
        while (integers!=0){
            
            //Create an if statement to determine if 0 was inputed.
            if (integers>0 && integers<101){
                //Place the integer value in the array.
                integersArray[integersCount] = integers;
                //Increment the count.
                integersCount++;
            }
            else 
                break;
            
            //Create a statement to allow for the next input.
            integers = input.nextInt();
        }
        //Call a void method to display the result.
        for (int displayArray=0; displayArray<integersArray.length; displayArray++){
            
            //Create anf if statement to determine if a necessay has been print out.
            if (countNumbers(displayArray, integersArray) != 0 && displayArray != 0){
                //Print out the result.
                out.println("The count for '"+displayArray+"' is " +countNumbers(displayArray, integersArray));
            }
        }
    }
        //Create a method to count the number of times.
        public static int countNumbers (int displayArray, int[] integersArray){
            
            //Create the variables.
            int countNumbers = 0;
           
            //Create a for loop to check the number in the array.
            for (int checkingNumberInArray=0; checkingNumberInArray<integersArray.length; checkingNumberInArray++){
                //Create an if statement to determine when to increment the count.
                if (integersArray[checkingNumberInArray] == displayArray){
                    countNumbers++;
                }
            }
            //Return the count;
            return countNumbers;
        }
}
