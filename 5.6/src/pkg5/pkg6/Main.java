/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg6;

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
        
        /*This program is made to have a table of conversion of miles to kilometers
        and kilometers to miles. */
        
        //First create the table.
        System.out.println("Miles\t\tKilometers\t|\tKilometers\t\tMiles");
        
        //Create the loop needed to create the tables. i = Miles, j = Kilometers.
        for (int i=1, j=20 ; i<11 && j<66 ; i++,j+=5){
            
            double convertedKilometers = i*1.609;
            double convertedMiles = j/1.609;
            
        //Print the formated table.
        System.out.printf("%d%25.1f\t|\t%d%27.2f\n", i ,convertedKilometers, j, convertedMiles);
            
            
        }
        
        
    }
    
}
