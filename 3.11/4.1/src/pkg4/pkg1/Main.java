/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg1;

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
        
        System.out.println("This program is made to compute the area of a pentagon.");
        System.out.println("Please enter the the length from the center of the pentagon.");
        double r = input.nextDouble();
        
        if (r < 0){
            
            do {
                System.out.println("You have entered an invalid number of this length.");
                r = input.nextDouble();
            }
            while (r < 0);
        }
        
        double s = 2 * r * Math.sin(Math.PI / 5);
        
        double area = (5 * Math.pow(s,2))/(4 * Math.tan(Math.PI / 5));
        
        double roundedArea = (double) Math.round(area * 100) / 100;
        
        System.out.println("The area of this pentagon is "+roundedArea);
    }
    
}
