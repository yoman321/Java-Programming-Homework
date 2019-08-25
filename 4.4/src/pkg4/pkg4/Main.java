/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg4;

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
        
        System.out.println("The program is made to compute the area of an hexagon.");
        
        //Ask for the input of one of the side.
        System.out.println("Please enter a side of the hexagon.");
        double s = input.nextDouble();
        
        if (s>0){
            
            double Area = (6 * Math.pow(s, 2))/(4 * Math.tan(Math.PI/6));
            
            double roundedArea = (double) (Math.round(Area * 100)) / 100;
            
            System.out.println("The area of this hexagon shall be "+roundedArea+" while the non-rounded area shall be "+Area);
            
        }
        else
            System.out.println("It is impossible to make an hexagon out the length of this side.");
        
    }
    
}
