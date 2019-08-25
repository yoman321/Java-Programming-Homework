/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg6;

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
        
        //Import the Scanner.
        Scanner input = new Scanner(System.in);
        
        //Tell the user the usefulness of this program.
        System.out.println("This program is made to display a pattern according "
                + " to the number inputed.\n");
        
        //Ask the user to input a number.
        System.out.println("Please chhose a number for the pattern.");
        //Allow the input of the number.
        int number = input.nextInt();
        
        //Create an if statement to terminate the program if the number is invalid.
        if (number<=0){
            System.out.println("There is not pattern.");
        }
        else
        //Use the void method to display the pattern.
        displayPattern (number);
    
    }
    //Create a void method for this program.
    public static void displayPattern (int n){
        
        //Create the loop for this pattern.
        for (int i=1;i<=n;i++){
            for (int j=n-i;j>=0;j--){
                System.out.print("  ");
            }
            for (int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    
}
