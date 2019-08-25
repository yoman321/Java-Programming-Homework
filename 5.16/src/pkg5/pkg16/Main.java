/*
(Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in increasing order. For example, if the input integer is
120, the output should be as follows: 2, 2, 2, 3, 5.
 */
package pkg5.pkg16;

/**
 *
 * @author luoph
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
        
        //Tell the user what is the point of the program.
        System.out.println("This program displays the smalles factors in "
                + "increasing order of a integer.\n");
        
        //Set values for variables.
        int count = 2;
        
        //Tell the user to input his interger.
        int number = input.nextInt();
        
        //Make the loop that shall be used.
        while (number/count!=0){
            
            //Declare if statement for if can be divided by the count or not.
            if (number%count==0){
                int newNumber = number/count;
                number = newNumber;
                System.out.print(count+" ");
                
                 
            }
            else 
                count++;
        }
    }
    
}
