/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg2;

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
        
        //Import the Scanner;
        Scanner input = new Scanner (System.in);
        
        //Tell the user the point of this program.
        out.println("This program is made to input 10 integers and reverse them.");
        
        //Create the array in which the numbers will be stored.
        int[] numbers = new int[10];
        
        //Create a loop and ask for the user to enter the 10 numbers.
        out.print("Please enter your 10 numbers : ");
        for (int arrayIndex=0; arrayIndex<numbers.length; arrayIndex++){
            numbers[arrayIndex] = input.nextInt();
        }
        //Create a loop to copy the reversed array and display it.
        int[] reverseNumbers;
        reverseNumbers = reverseMethod(numbers);
        
        //Call a void method to print out the display.
        displayReverseArray(reverseNumbers);
    }
    //Create a method to reverse the numbers.
    public static int[] reverseMethod (int numbers[]){
        
        //Create an array for the reverse numbers.
        int[] reverseNumbers = new int[numbers.length];
        
        //Create a for loop to allow the array containing the numbers to to revesre it.
        for (int inputArray=0, reverseArray=reverseNumbers.length-1;
                inputArray<numbers.length; inputArray++, reverseArray--){
            //Copy the input array to the reverse array.
            reverseNumbers[reverseArray] = numbers[inputArray];
        }
        //Create the return statement.
        return reverseNumbers;
    }
    //Create a void method to display the result of the reverse array.
    public static void displayReverseArray (int[] reverseNumbers){
        
        //Display the result statement.
        out.print("The reverse array is : ");
        
        //Use a for loop to display the result.
        for (int arrayIndex=0; arrayIndex<reverseNumbers.length; arrayIndex++){
            out.print(reverseNumbers[arrayIndex]+" ");
        }
    }
    
}
