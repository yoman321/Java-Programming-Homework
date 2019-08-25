/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg3;

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
        
        //This program is made to reverse a number and determine if it is a palindrome.
        
        //Import the Scanner;
        Scanner input = new Scanner(System.in);
       
        //Tell the user the point of this prgram.
        System.out.println("This program is made to determine if a number "
                + " that has been inputed is a palindrome or not.\n");
        
        //Ask the user to enter the number that shall be verified.
        System.out.print("Please enter a number that you would like to verify :");
        //Create the input variable.
        int checkNumber = input.nextInt();
        
        //Print out the answer.
       if (isPalindrome(checkNumber) == true){
           System.out.println("This number is a palindrome.");
       }
       else 
           System.out.println("This number is not a palindrome.");
    }
     //Determine if the reverse a number is a palindrome with a boolean method.
    public static boolean isPalindrome(int number){
        
        //Return statement as a boolean.
        return number == reverse(number);
    }
    
    //Create a method to reverse a number.
    public static int reverse (int number){
        
        //Make everything a string to be able to reverse the number.
        String reverse = "";
        String stringNumber = number + "";
        
        //Make a loop to reverse the string. You need to make the length -1.
        for (int i=stringNumber.length()-1;i>=0;i--){
            reverse += stringNumber.charAt(i);     
        }
        //Create an integer out of the boolean.
        int intReverse = Integer.parseInt(reverse);
        
        //Return the value.
        return intReverse;
        
       
         
    }
  
}