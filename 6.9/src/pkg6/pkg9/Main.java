/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg9;

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
        
        //This program is made to make the conversion of foot to meter and vice-versa.
        
        //Create the constant variables.
        final double MIN_FEET = 1.0;
        final double MAX_FEET = 10.0;
        final double MAX_METERS = 65.0;
        final double MIN_METERS = 20.0;
        
        //Create the table.
        System.out.println("Feet     Meters     |     Meters     Feet");
        System.out.println("-----------------------------------------");
        
        //Create the loop to print out the converted values.
        for (double feet=MIN_FEET, meters=MIN_METERS; 
            feet<=MAX_FEET; feet++, meters+=5){
            
            //Make the conversion with the method.
            //f = feet conversion ; m = meters conversion
            double f = footToMeter (feet);
            double m = meterToFoot (meters);
            
            //Print the values in the table.
            System.out.printf("%.1f%12.3f",feet, f);
            System.out.print("    |    ");
            System.out.printf("%5.1f%13.3f\n", meters, m);
        }
    }
    //Create the feet conversion method.
    public static double footToMeter (double foot){
        return 0.305 * foot;
    }
    //Create the meters conversion method.
    public static double meterToFoot (double meter){
        return 3.279 * meter;
    }
}
