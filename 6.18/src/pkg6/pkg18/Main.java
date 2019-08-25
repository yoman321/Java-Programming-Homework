/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg18;

/**
 *
 * @author Utilisateur
 */
import static java.lang.System.out;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Import the Scanner.
        Scanner input = new Scanner (System.in);
        
        //Tell the user the purpose of this program.
        System.out.println("The purpose of this program to check if a password is"
                + " valid or invalid.\n");
        out.println("Password requirement : ");
        out.println("- 8 characters");
        out.println("- only letters and digits");
        out.println("- contains at least 2 digits\n");
        
        //Ask for the password input from the user.
        out.print("Please enter the password by following the requirement : ");
        String password = input.next();
        
        //Do an if statement to check the password with the methods.
        if (!numberOfCharacters(password) || !digitsOrLetters(password)
                || !numberOfDigits(password)){
            out.println("Your password is invalid.");
        }
        else
            out.println("Your password is valid.");
        
    }
    //Create a method to check if the password has 8 characters.
    public static boolean numberOfCharacters (String password){
        
        //Create the if statement to determine the length of the password.
        if (password.length() >= 8){
            return true;
        }
        return false;
    }
    //Create the method which consist to determine if the password only has letters and digtis.
    public static boolean digitsOrLetters (String password){
        
        //Create the loop to check every letter of the string.
        for (int i=0; i<password.length(); i++){
            
            //Check what to return with an if statement.
            if (!Character.isLetterOrDigit(password.charAt(i))){
                return false;
            }
        } 
        return true;
    }
    //Create a method to check if there the password has two digits.
    public static boolean numberOfDigits (String password){
        
        //Create a char variable.
        char numberDigits;
        int oount = 0;
        
        //Create a loop to find the number of digits in the string.
        for (int i=0; i<password.length(); i++){
            
            //Set the string character as the variable.
            numberDigits = password.charAt(i);
            
            //Create an if statement to know if there is two digits.
            if (Character.isDigit(numberDigits)){
                oount++;
            }
        }
        //Determine whether to return true of flase.
        if (oount >= 2){
            return true;
        }
        return false;
    }
}
