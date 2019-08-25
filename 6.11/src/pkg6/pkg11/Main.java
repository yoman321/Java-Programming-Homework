/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg11;

/**
 *
 * @author Utilisateur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //The goal is to display a table using a scheme on exercice 5.39.
        
        //Create a loop to display the table.
        System.out.println("Sales Amount\tCommission");
        System.out.println("---------------------------");
        
        //Create a loop to display the results.
        for (double salesAmount=10000; salesAmount<=100000; salesAmount+=5000){
            System.out.printf("%.0f%20.1f\n", salesAmount, computeCommission(salesAmount));
        }
    }
    //Create the method to compute the commission.
    public static double computeCommission (double salesAmount){
        
        //Create the variables.
        double commissionRate = 0.08;
        double commission = 0;
        
        //Create a for loop to determine the commission the first 2 commissions.
        for (double range=1; range<=2; range++){
            salesAmount -= 5000;
            commission += 5000 * commissionRate;
            
            //Increase the commsion rate.
            commissionRate += 0.02;
        }
        //Create an if statement to determine if the third commission rate is require.
        if (salesAmount != 0){
            commission += salesAmount * 0.12;
        }
        
        //Make the return statement.
        return commission;
    }
    
}
