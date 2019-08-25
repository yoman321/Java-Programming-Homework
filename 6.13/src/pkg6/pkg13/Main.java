/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg13;

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
        
        //This program is made to compute a table of a sum serie.
        
        //Create the variables.
        double minI = 1;
        double maxI = 20;
        
        
        //Create the table.
        System.out.println("i\tm(i)");
        System.out.println("------------");
        
        //Call the void method.
        sumSeries (maxI, minI);  
    }
    //Create the void method.
    public static void sumSeries (double maxI, double minI){
        
        //Create the sum variable.
        double sum = 0;
        double numerator = 1;
        double denominator = 2;
        
        //Create a for loop to print out the values.
        for (double k=minI; k<=maxI; k++){
            //Make the sum serie.
            sum += numerator / denominator;
            //Increment the denominator and numerator.
            numerator++;
            denominator++;
            //Display the values in the table.
            System.out.printf("%.0f%20.4f\n", k, sum);
        }
    }
    
}
