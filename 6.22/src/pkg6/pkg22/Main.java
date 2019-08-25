/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg22;

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
        
        //Import the Scanner.
        Scanner input = new Scanner (System.in);
        //Tell the user what is hte point of the program.
        out.println("This program is made to approximate the square root of a number.\n");
        
        //Ask the user to enter a number.
        out.print("Please enter a number " );
        long squareRootNumber = input.nextLong();
        
        //Display the result of this program.
        out.println("The square root of "+squareRootNumber+" is "+sqrt(squareRootNumber));
    }
    //Create a method to find the square root of the inputed number.
    public static double sqrt(long n){
        
        //Create the variables.
        long lastGuess = 1;
        long nextGuess = (lastGuess + n / lastGuess) / 2;
        
        final double margin = 0.0001;
        
        //Create the loop to find the final answer and reurn it.
        while (nextGuess - lastGuess > margin){
            //Create the formula to calculate the sqare root of the inputed number.
            nextGuess = (lastGuess + n / lastGuess) / 2;
            //Change lastGuess value.
            lastGuess = nextGuess;
        }
        return lastGuess;
    }
    
}
