/*
(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as shown in the following sample run:
             1
           2 1 2
         3 2 1 2 3
       4 3 2 1 2 3 4
     5 4 3 2 1 2 3 4 5
   6 5 4 3 2 1 2 3 4 5 6
 7 6 5 4 3 2 1 2 3 4 5 6 7
 */
package pkg5.pkg17;

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
        //Input the Scanner.
        Scanner input = new Scanner(System.in);
        
        //Tell the user the use of this program.
        System.out.println("This program is made to have a number from 1 to 15"
                + " inputed and have it make a pyramid.\n");
        
        //Ask the user for the number.
        System.out.println("Please input the desired number.");
        int number = input.nextInt();
        
        //Make sure that the user cannot input non-desired numbers.
        while (number<1 || number>15){
            System.out.println("The number you have inputed is invalid."
                    + " Please input a valid number.");
            
            number = input.nextInt();  
        }
        
        //Make the loop to show the pyramid (left side).
        for (int i=1;i<=number;i++){
            for (int j=number-i;j>=0;j--){
                System.out.print("  ");
            }
            //Print the left side of the pyramid (descending).
            for (int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            
            //Print the right side of the pyramid (ascending).
            for (int h=2;h<=i;h++){
                System.out.print(h+" ");
            }
            System.out.println();
            
        }
        
    }
    
}
