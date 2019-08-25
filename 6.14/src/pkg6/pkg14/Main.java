/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg14;

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
        
        //This program is made to estimate the valur of PI.
        
        //Create the variables.
        int minI = 1;
        int maxI = 901;
        
        //Create the table.
        System.out.println("i\t\tm(i)");
        System.out.println("------------------------");
        
        //Refer to the return method to print out the values with a for loop.
        for (int i=minI; i<=maxI; i+=100){
            System.out.printf("%d%20.4f\n", i, estimatePI(i));
        }
       
    }
    //Create the void method.
    public static double estimatePI (double i){
        
        //Create variables.
        double sum = 0;
        double finalSum = 0;
        //Create loop to determine the value of PI.
        for (double k=1; k<=i; k++){
            sum += Math.pow(-1, k+1) / (2 * k -1);
        }
        //Create the final value of PI.
        sum *= 4;
        
        //Create the return value.
        return sum;
        
    }
    
}
