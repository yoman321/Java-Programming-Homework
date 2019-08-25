/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg21;

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
        Scanner input = new Scanner(System.in);
        
        //Tell the user the use of this program.
        out.println("This program is made to translate letters in a phone number into digits.\n");
        
        //Ask the user for its input.
        out.print("Please input the phone number : ");
        String phoneNumber = input.nextLine();
        
        //Print out the result.
        out.println("The phone number shall be "+getNumber(phoneNumber));
    }
    //Create the method for the phone number conversion.
    public static int getNumber (char upperCaseLetter){
        
        //Create the loop to determine if the character is either 
    }
    
}
