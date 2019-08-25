/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg8;

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
        
        /*The point of this program is to make a table ov conversion from 
        celsius to fahrenheit and vice-versa.
        */ 
        
        //Create the variables for this program.
        final double MAX_CELSIUS = 40.0;
        final double MIN_CELSIUS = 31.0;
        final double MAX_FAHRENHEIT = 120.0;
        final double MIN_FAHRENHEIT = 30.0;
        
        //Create the table for this program.
        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
        System.out.println("------------------------------------------------"
                + "---------------");
        //Create the loop for this program.
        for (double celsius=MAX_CELSIUS, fahrenheit=MAX_FAHRENHEIT
                ;celsius>=MIN_CELSIUS;celsius--, fahrenheit-=10){
            
                //Call the methods to convert the values. 
                //CEL = celsius conversion ; FAH = fahrenheit conversion
                double CEL = celsiusToFahrenheit (celsius);
                double FAH = fahrenheitToCelsius (fahrenheit);
                
                //Print out the values on the table.
                System.out.printf("%.2f%16.1f\t\t|\t%5.1f%17.2f\n", celsius, CEL, fahrenheit, FAH);
            }    
    }
    //Create the celsius conversion method.
    public static double celsiusToFahrenheit (double celsius){
        return (9.0 / 5) * celsius + 32;
    }
    //Create the fahrenheit conversion method.
    public static double fahrenheitToCelsius (double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
    
}
