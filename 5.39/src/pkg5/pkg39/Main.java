/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg39;

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
        double balance, commission,finalEarn,sales;
        finalEarn = 30000;
        sales = 0;
        do {
             sales += 0.01;
             commission = 0;
             balance = 0;
            if (sales>10000)
                commission = (sales - 10000)*0.12;
            
            if (sales>5000)
                commission = (sales -5000)*0.10;
            
            if (sales > 0)
                commission = 0.08;
        }
        while (commission +5000 < 30000);
        System.out.println(sales);
        }
  
    }
    

