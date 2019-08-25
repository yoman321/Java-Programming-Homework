/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg23;

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
        Scanner input = new Scanner (System.in);
        double drivingDistance, milesPerGallon, pricePerGallon, costOfDriving;
        
        System.out.println("Please enter the driving distance");
        drivingDistance = input.nextDouble();
        System.out.println("Please enter the number of miles per gallon");
        milesPerGallon = input.nextDouble();
        System.out.println("Please enter the price per gallon");
        pricePerGallon = input.nextDouble();
        
        costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;
        
        System.out.println("The cost of driving is of "+costOfDriving);
        
    }
    
}
