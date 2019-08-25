/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg20;

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
        
        double windchill, temp;
        
        System.out.println("Enter a value for the temperautre and a value for the wind-chill speed");
        
        temp = input.nextDouble();
        windchill = input.nextDouble();
       
        
        if ((-58 < temp )&&(temp < 41)) {
            
        }
        else{
            System.out.println("Invalid input");
    }
    if (windchill > 2) {
        System.out.println("The windchill temperature is " +(35.74 + 0.6125*temp - 35.75 * (Math.pow(windchill,016)) + 0.4275 * temp * (Math.pow(windchill, 016) )));
    
    }
    else
        System.out.println("Invalid input");
}
    
}
