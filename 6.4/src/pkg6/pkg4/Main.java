/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg4;

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
        //Import the Scanner;
        Scanner input = new Scanner(System.in);
        
        //Tell the user the point of this program.
        System.out.println("This program is made to reverse the order of"
                + " an interger and display it.\n");
        
        //Ask the user to display enter the desired number.
        System.out.println("Please enter the number that shall be reversed.");
        //Input the number.
        int number = input.nextInt();
        
        //Display the reveersed number.
        System.out.print("The reverse of "+number+" is ");
        reverse(number);
    }
    //Create a method for this program.
    public static void reverse (int number){
        
        //Transform the integer into a string.
        String reverse = "";
        String NUMBER_TO_REVERSE = number+"";
        
        //Create a loop to be able to reverse the number.
        for (int i=NUMBER_TO_REVERSE.length()-1;i>=0;i--){
            reverse += NUMBER_TO_REVERSE.charAt(i);
        }
        //Transform this string back to an integer.
        int intReverse = Integer.parseInt(reverse);
        
        //Print the answer.
        System.out.print(intReverse);
        
    }
    
}
