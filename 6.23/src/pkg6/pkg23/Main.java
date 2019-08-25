/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg23;

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
        
        //Input the Scanner;
        Scanner input = new Scanner(System.in);
        
        //Tell the user the use of this program.
        out.println("This program is made to have a string and a letter inputed"
                + " afterward to be able to count the number of the chosen letter"
                + "can be found in the inputed string.\n");
        
        //Ask for the input of the user.
        out.println("Please input the string and the character in the following format"
                + " (String , letter ) : ");
        String messageAndCharacter = input.nextLine();
        
        //Get the substring.
        int separator = messageAndCharacter.indexOf(',');
        String message = messageAndCharacter.substring(0,separator);
        String character = messageAndCharacter.substring(separator+1);
        
        //Transform the string character in a char value.
        char charCharacter = transformLetter(character);
        
        //Display the result of this program. by using the method.
        out.println("The number of '"+charCharacter+"' that could be found in '"+message+
                "' is "+count(message, charCharacter));
    }
    //Create the method to find the letters int the string.
    public static int count (String str, char a){
        
        //Create the count variable.
        int count = 0;
        
        //Create a loop to find the every wanted character in the string.
        for (int i=0; i<str.length(); i++){
            //Create an if statement to compare characters.
            if (str.charAt(i)==a){
                //Incremenbt count if it is true.
                count++;
            }
        }
        //Return the count value.
        return count;
    }
    //Create a method to transform the character string into a char value.
    public static char transformLetter (String stringCharacter){
        
        //Change the string variable to character.
        char charCharacter = stringCharacter.charAt(0);
        
        return charCharacter;
    }
    
}
