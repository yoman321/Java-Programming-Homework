/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg7;

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
        
        //Give the initial values.
        final int MAX_YEARS = 30;
        
        //Tell the user the point of this program.
        System.out.println("This program is made to computes future investment "
                + " value at a given interest rate for a specified number" 
                + " of years");
        
        //Ask the user to input those values.
        System.out.print("Invested Amount : ");
        double investementAmount = input.nextDouble();
        System.out.print("Annual Interest Rate : ");
        double annualInterestRate = input.nextDouble();
        
        //Use the inputed values to create the needed values.
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        
        //Create the table.
        System.out.println("Years\t\tFuture Value");
        
        //Create a loop to be able to make a table.
        for (int ongoingYear=1;ongoingYear<=MAX_YEARS;ongoingYear++){
            
            System.out.printf("%5d%23.2f\n", ongoingYear, 
                    futureInvestementValue (investementAmount, monthlyInterestRate, ongoingYear));
            
        }
    }
    //Create the method to find the future value.
    public static double futureInvestementValue (double investementAmount,
            double monthlyInterestRate, int years){
        
        return investementAmount * Math.pow((1 + monthlyInterestRate),(years * 12));
        
    }
    
}
