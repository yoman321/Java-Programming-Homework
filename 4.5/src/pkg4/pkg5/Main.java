/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg5;

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
        
        System.out.println("This program is made to compute the area of any regular polygon.");
        
        //Ask for the user to enter the number of side of the polygon.
        System.out.print("Please enter the number of side of this polygon :  ");
        int NUMBER_OF_SIDE = input.nextInt();
        
        //Check if the number of side for the polygon is correct.
        if(NUMBER_OF_SIDE <= 0){
            
            //If there is an incorrect number of side for the polygon, ask the user to re-enter it with a loop.
            do {
                System.out.print("The number of sides you have entered for this polygon is not available. Please re-enter it : ");
                NUMBER_OF_SIDE = input.nextInt();
            }
            while (NUMBER_OF_SIDE <= 0);
            
        } 
            //If the number of side is correct, continue by asking the length of the side.
        System.out.print("Please enter the length of the side for your polygon : ");
        double LENGTH_OF_SIDE = input.nextDouble();
            
            //Check if the side length is valid or not.
        if (LENGTH_OF_SIDE <= 0){
                
                //If the side length is invalid, ask the user to re-enter that length.
            do{
                System.out.print("Please re-enter the side length, since the previous one was invalid : ");
                LENGTH_OF_SIDE = input.nextDouble();
            }
            while (LENGTH_OF_SIDE <= 0);
        }
        
        //Change the variables into simpler ones and compute the area using these new variables.
        double n = NUMBER_OF_SIDE;
        double s = LENGTH_OF_SIDE;
        double area = (n * Math.pow(s,2))/(4 * Math.tan(Math.PI/n));
        
        //Round the area to the 0.01 to make it look better.
        double roundedArea = (double) Math.round(area * 100) / 100;
        
        //Tell the user the result in the end.
        System.out.println("The area for this polygon shall be "+roundedArea);
        
    }
    
}
