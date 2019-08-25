/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg17;

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
        
        //This program is made to compute an n by n matrix.
        
        //Import the Scanner.
        Scanner input = new Scanner(System.in);
        
        //Tell the user the use oif this program.
        System.out.println("this program is made to compute a n by n matrix.\n");
        
        //Ask the user to input the number for this matrix.
        System.out.print("Please enter the matrix number: ");
        int numberMatrix = input.nextInt();
        
        //Call the method.
        printMatrix(numberMatrix);
    }
    public static void printMatrix (int n){
        
        //Create the count value.
        int count = 0;
        
        //Create the loop to print the matrix.
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n;j++){
                //Create the random value.
                int randomValue = (int) (Math.random() * 2);
                //Create an if statement to jump row.
                if (count == n){
                    System.out.println(randomValue);
                    count = 0;
                }
                else
                    System.out.print(randomValue+" ");
            }
            System.out.println();
        }
        
    }
    
}
