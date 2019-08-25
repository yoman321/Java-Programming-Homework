/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg18;

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
        double weight;
          
        System.out.println("Enter the weight of the package");
        
        weight = input.nextDouble();
        
        if (weight < 0){
            
        
            if (weight > 0 && weight <= 1) {
                System.out.println("The cost of the shipping is 3.5$");
            }
        
            else if (weight > 1 && weight <= 3) {
                System.out.println("The cost of the shipping is 5.5");
            }
            
            else if (weight > 3 && weight <= 10) {
                System.out.println("The cost of the shipping 8.5");
             
            }   
            else if (weight > 10 && weight <= 20) {
                System.out.println("The cost of the shipping is 10.5%");
            
            }
            else 
                System.out.println("The package can't be ship");
        }
        else
            System.out.println("There is no package that weight under 0.");
    }
    
}
