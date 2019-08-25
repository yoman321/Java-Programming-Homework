/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg20;

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
        
        //Get the Scanner,
        Scanner input = new Scanner(System.in);
        
        //Tell the user the point of this program.
        out.println("This program is made to count the numbers of letters ina string.\n");
        
        //Ask the user for an input.
        out.print("Please input a string : ");
        String letters = input.next();
        
        //Tell the user  the result of this program.
        out.println("There is "+countLetters(letters)+" in this string.");
    }
    //Create the method to count the number of letters in a string.
    public static int countLetters (String s){
        
        //Get the count variable.
        int count = 0;
        
        //Create a loop to get the numebr of letters in a string.
        for (int i=0; i<s.length(); i++){
            if (Character.isLetter(s.charAt(i))){
                count ++;
            } 
        }
        return count;
    }
    
}
