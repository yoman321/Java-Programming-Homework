/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg19;

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
        double edge1, edge2, edge3, perimeter;
        
     
        System.out.println("Enter a value for edge 1");
        edge1 = input.nextDouble();
        System.out.println("Enter a value for edge 2");
        edge2 = input.nextDouble();
        System.out.println("Enter a value for edge 3");
        edge3 = input.nextDouble();
        
        if ((edge1 + edge2 > edge3) && (edge2 + edge3 > edge1) && (edge3 + edge1 > edge2)){
            perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter of this triangle is " +perimeter);
           
       
            }
        
            else 
       System.out.println("This is not a triangle");
            
            
    }
    
    
    }
       
    
    

