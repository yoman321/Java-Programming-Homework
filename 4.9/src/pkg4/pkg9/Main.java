/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg9;

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
        Scanner input = new Scanner(System.in);
        
        //Tell the user that this program is going to do.
        System.out.println("This program is made to compute the character and display its unicode.");
        
        //Ask the user to input a character.
        System.out.println("Please enter a character which will allow the programt to display its unicode.");
        String num = input.nextLine();
        
        //Use the inputed number to display the wanted Unicode character.
        char letter = num.charAt(0);
        
        int unicode = (int) letter;
        
        //Display the result of the program.
        System.out.println("The Unicode character shall be : "+unicode);
                
                
                
    }
    
}
