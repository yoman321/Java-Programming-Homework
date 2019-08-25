/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg2;

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
        // TODO code application logic here
        
        //This program is made to sum the digits of an integer.
        
        //Import the Scanner.
        Scanner input = new Scanner(System.in);
        
        //Tell the user the point of this program.
        System.out.println("This program is made to sum digits "
                + " of a number you enter.\n");
        
        //Tell the user to enter a digit.
        System.out.println("Please enter a number.");
        //Create the input variable.
        int number = input.nextInt();
        
        //Display the result of this sum.
        System.out.println("The sum of the digits of "
                 +number+ " is "+sumDigits(number));
        
    }
    //Create the method for this program.
    public static int sumDigits(long n){
        
        //Make variables for this method.
       int sum = 0;
       long newN = 0;
        
        //Create the loop that will be used for this program.
        while (n > 0){
            sum += n%10;
            newN = n/10;
            n = newN;
               
        }
        return sum;
    }
    
}
