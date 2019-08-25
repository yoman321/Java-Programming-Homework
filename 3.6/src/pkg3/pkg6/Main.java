/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6;

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
        Scanner input = new Scanner(System.in);
        
        final double conversionKilograms =  0.45359237;
        final double conversionHeight =  0.0254;
        
        System.out.print("Please enter your weight in pounds: ");
        double pounds = input.nextDouble();
        
        System.out.print("Please enter your feet height: ");
        double feet = input.nextDouble();
        
        System.out.print("Please enter your inches height: ");
        double inches = input.nextDouble();
        
        double feetInInches = feet * 12;
        
        double totalHeight = feetInInches + inches;
        
            double weight = conversionKilograms * pounds;
            
            double height = conversionHeight *totalHeight;
            
            double BMI = weight / (Math.pow(height, 2));
               
               if (BMI <= 0 )
                   System.out.println("Not human");
            
               else if(BMI < 18.5)
                    System.out.println("Underweight");
                
               else if (BMI < 25)
                    System.out.println("Normal");
                
               else if (BMI < 30)
                    System.out.println("Overweight");
                
                else
                    System.out.println("Obese");
                    
                
        
            
    }
    
}
