/*
(Financial application: compare loans with various interest rates)
Write a program that lets the user enter the loan amount
and loan period in number of years
and displays the monthly and total payments for each interest rate starting from
5% to 8%, with an increment of 1/8.
 */
package pkg5.pkg21;

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
        
        //Set variables for the interest rate.
        double minInterestRate = 5.000;
        double maxInterestRate = 8.000;
        
        //Tell the user the point of this program.
        System.out.println("This program is made to compute the loan amount"
                + " and the loan period in years. A table will be use to display"
                + " the monthly and total payement for each interest rate "
                + " with an increment of 1/8 per year.\n");
        
        //Ask the user to input the loan amount.
        System.out.print("Loan Amount: ");
        double LOAN_AMOUNT = input.nextDouble();
        
        //Also set a a temp Loan amount.
        double NEW_LOAN_AMOUNT = LOAN_AMOUNT; 
        
        //Ask the user to input the number of years for the loan.
        System.out.print("Number of Years: ");
        int NUMBER_OF_YEARS = input.nextInt();
        
        //Create the table.
        System.out.println("Interest Rate\t\tMonthly Payement\tTotal Payement");
        
        //Set the loop for this program.
        for (int CURRENT_MONTH=1;CURRENT_MONTH<NUMBER_OF_YEARS*12;CURRENT_MONTH++){
            //Set the if statement so the interest rate does not go over 8.000%.
            if (minInterestRate<=maxInterestRate){
                
                //Get the monthly interest rate.
                double MONTHLY_INTEREST_RATE = minInterestRate / 1200;
                
                //Get the the monthly payement.
                double MONTHLY_PAYEMENT = NEW_LOAN_AMOUNT * MONTHLY_INTEREST_RATE / 
                        (1-1 / Math.pow(1+MONTHLY_INTEREST_RATE, NUMBER_OF_YEARS * 12));
            
                //Get the total payement for this interest rate.
                double TOTAL_PAYEMENT = MONTHLY_PAYEMENT * NUMBER_OF_YEARS *12;
            
                //Print the result before resetting the loop.
                System.out.printf("%.3f %25.2f %25.2f\n",minInterestRate, MONTHLY_PAYEMENT,
                        TOTAL_PAYEMENT);
                
                //Increment the interest rate.
                minInterestRate += 0.125;
            }
        }
    }
    
}
